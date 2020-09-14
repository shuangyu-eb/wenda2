FROM openjdk:8-jdk-alpine
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 9000
