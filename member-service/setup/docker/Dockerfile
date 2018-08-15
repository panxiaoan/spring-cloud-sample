FROM index.tenxcloud.com/tenxcloud/java:8
MAINTAINER panxiaoan(xiaoan.pan@qq.com)
COPY member-service.jar /home
WORKDIR /home
CMD java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar /home/member-service.jar