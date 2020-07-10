# HTML Notes:
- Check out the Font that I used on Bluebird - @import url(//fonts.googleapis.com/css?family=Lato:300);
- Find More Backgrounds at http://subtlepatterns.com/ 
- Can use this site to download Google Web Fonts https://google-webfonts-helper.herokuapp.com/fonts

# Docker Build
mvn clean compile package dockerfile:build 

Environment Vars

SPRING_PROFILES_ACTIVE = dev (or prod)


### Push to Docker Hub
docker tag spring-boot-thymeleaf:latest tsweets/spring-boot-thymeleaf:latest
docker push tsweets/spring-boot-thymeleaf:latest


Run Example:

Local<br>
docker run -p 80:8080 --env SPRING_PROFILES_ACTIVE=dev spring-boot-thymeleaf


Production<br>
docker run -p 80:8080 --env "SPRING_PROFILES_ACTIVE=prod" spring-boot-thymeleaf:latest


# Run in Intellij
Add to VM options -Dspring.profiles.active=dev


# Start Script

`
\#/bin/bash
docker run -d -p 8888:8888 -v "/var/log/spring-boot-thymeleaf:/spring-boot-thymeleaf" --env "SPRING_PROFILES_ACTIVE=prod" --restart unless-stopped <image>:$1
`

run with the tag for example 'spring-boot-thymeleaf-start.sh 0.0.1-120'




