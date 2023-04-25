FROM openjdk:17-jdk-slim-buster

COPY build/libs/Spring-Boot-Starter-0.0.1-SNAPSHOT.jar Spring-Boot-Starter-0.0.1-SNAPSHOT.jar

ENTRYPOINT java -jar Spring-Boot-Starter-0.0.1-SNAPSHOT.jar
