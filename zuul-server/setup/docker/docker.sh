#!/bin/bash

CONTAINER_NAME=$1
PORT=$2
BUILD_ID=$3
COMMIT_ID=$4
IMAGES_NAME=$CONTAINER_NAME

cd /opt/app/$CONTAINER_NAME

echo ">>> build_id:"$1" commit_id:"$2" buildtime:"`date "+%Y-%m-%d %H:%M:%S"`
echo ">>> build_id:"$1" commit_id:"$2" buildtime:"`date "+%Y-%m-%d %H:%M:%S"` >> docker.log

FILENAME=$(find -name $CONTAINER_NAME.jar)
APP_NAME=${FILENAME##*/}
chmod  777 $APP_NAME
if [ -z "$APP_NAME" ]
then
    echo "not find……:"$APP_NAME
    exit
else
    echo "find app……:"$APP_NAME
fi

echo ">>> docker stop……"
docker stop $CONTAINER_NAME

echo ">>> docker rm container……"
docker rm $CONTAINER_NAME

IMAGE_ID=$(docker images | grep "$IMAGES_NAME" | awk '{print $3}')
echo ">>> i am docker iamges: " $IMAGE_ID
if [ -z "$IMAGE_ID" ]
then
    echo ">>> no images need del"
else
    echo ">>> rm images……:" $IMAGE_ID
    docker rmi -f $IMAGE_ID
fi

echo ">>> docker build……"
docker build --build-arg app=$APP_NAME . -t $IMAGES_NAME:$BUILD_ID

echo ">>> docker run……"
docker run -d -m 300M --memory-swap -1 -e JAVA_OPTS='-server -Xms256m -Xmx256m' "SPRING_PROFILES_ACTIVE=test" -p $PORT:$PORT --name $CONTAINER_NAME $IMAGES_NAME:$BUILD_ID
