#!/bin/sh
echo "Starting SB Thymeleaf"
echo "Jar File: $JAR_FILE_VAR"
exec java  -Djava.security.egd=file:/dev/./urandom -jar $JAR_FILE_VAR
