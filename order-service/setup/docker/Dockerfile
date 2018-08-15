FROM java:8
MAINTAINER panxiaoan(xiaoan.pan@qq.com)
COPY order-service.jar /home
WORKDIR /home
CMD java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar /home/order-service.jar