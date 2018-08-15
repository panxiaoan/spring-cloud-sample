FROM java:8
MAINTAINER panxiaoan(xiaoan.pan@qq.com)
COPY zuul-server.jar /home
WORKDIR /home
CMD java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar /home/zuul-server.jar