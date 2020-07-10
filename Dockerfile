FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
ENV JAR_FILE_VAR=/${JAR_FILE}
ADD target/${JAR_FILE} /
ADD entrypoint.sh /
ENTRYPOINT /entrypoint.sh