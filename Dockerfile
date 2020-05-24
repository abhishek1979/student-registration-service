# Start with a base image containing Java runtime
#FROM openjdk:11-jdk-alpine

#FROM alpine:edge

FROM adoptopenjdk/openjdk11:ubi

# Add Maintainer Info
LABEL maintainer="abhishek.scjp@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 9999 available to the world outside this container
EXPOSE 8888

# The application's jar file
#ARG JAR_FILE=target/student-registration-service-0.0.1-SNAPSHOT-exec.jar

# Add the application's jar to the container
#ADD ${JAR_FILE} student-registration-service.jar

#ENTRYPOINT ["java","-jar","/student-registration-service.jar"]

ADD target/*-exec.jar student-registration-service.jar

ENTRYPOINT [ "sh", "-c", "java -jar /student-registration-service.jar" ]
