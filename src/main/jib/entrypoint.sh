#!/bin/sh

echo "Starting Spring Boot Thymeleaf"
exec java ${JAVA_OPTS} -noverify -XX:+AlwaysPreTouch -Djava.security.egd=file:/dev/./urandom -cp /app/classpath/thymeleaf-1.0-SNAPSHOT.original.jar:/app/libs/* "org.beer30.sbmvc.thymeleaf.Application"  "$@"
