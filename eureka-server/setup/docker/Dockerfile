FROM index.tenxcloud.com/tenxcloud/java:8
MAINTAINER panxiaoan(xiaoan.pan@qq.com)
COPY eureka-server.jar /home
WORKDIR /home
CMD java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar /home/eureka-server.jar