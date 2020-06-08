FROM  openjdk:8-jdk-alpine
ADD target/oauth-security.jar oauth-security.jar
EXPOSE 8085
ENTRYPOINT ["java", "-Dspring.profiles.active=sit", "-jar", "oauth-security.jar"]