FROM openjdk:17-jdk-slim-buster
ADD build/libs/Training-Tracker-0.0.1-SNAPSHOT.jar Training-Tracker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","Training-Tracker-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080

