#基于linux镜像安装应用镜像
FROM docker.io/centos
MAINTAINER The CentOS chirq testImages - spring-boot-study
RUN mkdir -p /usr/app
RUN ls
RUN pwd
RUN mkdir -p /usr/app/jdk1.8
COPY jdk1.8.0_161/ /usr/app/jdk1.8/
ENV JAVA_HOME /usr/app/jdk1.8
ENV PATH $JAVA_HOME/bin:$PATH
COPY spring-boot-study.jar /
EXPOSE 8100
#CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/spring-boot-study.jar"]
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/spring-boot-study.jar"]

#1.2版本
# 指定一个基础镜像centos
#FROM docker.io/centos:latest
#安装应用执行的环境java
#RUN yum -y install java
#将指定的jar文件复制到容器中
#COPY spring-boot-study.jar /
#VOLUME /tmp
#EXPOSE 8100
#ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar /spring-boot-study.jar"]