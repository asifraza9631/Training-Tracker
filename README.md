# Spring Boot application template

## Purpose

The purpose of this template is to speed up the creation of new Spring applications within Fission Labs
and help keep the same standards across multiple teams. If you need to create a new app, you can
simply use this one as a starting point and build on top of it.

## What's inside

The template is a working application with a minimal setup. It contains:
 * application skeleton
 * common plugins and libraries
 * docker setup
 * code quality tools already set up
 * testing libraries

## Plugins

The template contains the following plugins:

  * checkstyle

    https://docs.gradle.org/current/userguide/checkstyle_plugin.html

    Performs code style checks on Java source files using Checkstyle and generates reports from these checks.
    
   We can generate the report by running the below command:

   
```    
  ./gradlew checkstyleMain
  ```
 
  The report will be created in build/reports/checkstyle/main.html location in your project directory.
 

    

  * pmd

    https://docs.gradle.org/current/userguide/pmd_plugin.html

    Performs static code analysis to finds common programming flaws. Included in gradle `check` task.
       
   We can generate the report by running the below command:

 ```    
  ./gradlew pmdMain
  ```
 
  The report will be created in build/reports/pmd/main.html location in your project directory.
 


  * jacoco

    https://docs.gradle.org/current/userguide/jacoco_plugin.html

    Provides code coverage metrics for Java code via integration with JaCoCo.
    You can create the report by running the following command:

    ```bash
      ./gradlew jacocoTestReport
    ```

    The report will be created in build/jacocoHtml/index.html location in your project directory.

  * io.spring.dependency-management

    https://github.com/spring-gradle-plugins/dependency-management-plugin

    Provides Maven-like dependency management. Allows you to declare dependency management
    using `dependency 'groupId:artifactId:version'`
    or `dependency group:'group', name:'name', version:version'`.

  * org.springframework.boot

    http://projects.spring.io/spring-boot/

    Reduces the amount of work needed to create a Spring application
    
  * Pacts
    
    https://docs.pact.io/
    
    Pact is a code-first tool for testing HTTP and message integrations using contract tests

 * Testcontainers
    
    https://www.testcontainers.org/#about-testcontainers-for-java
    
    Testcontainers for Java is a Java library that supports JUnit tests, providing lightweight, 
    throwaway instances of common databases, Selenium web      browsers, or anything else that can run in a Docker container
   
  
 * SonarQube
    
    https://docs.sonarqube.org/latest/analyzing-source-code/languages/java/
    
    SonarQube is a self-managed, automatic code review tool that systematically helps you deliver clean code
    
```    
./gradlew sonar -D "sonar.projectKey=Spring-Boot-Starter" -D "sonar.host.url=http://localhost:9000" -D "sonar.login={token generated while integeration}"
  
  ```


To check your code quality go to your browser
where sonarqube is running http://localhost:9000
go to your project and See the status of code

## Prerequisite

The following prerequisites are required for the template to function properly:
 * Java 17 or above
 * Gradle 8.x
 * MySql 8.x
 * SonarQube 9.9
 * Checkstyle 7.8.1
 * Pmd 6.37.0

## Setup

**Clone the project to specified folder and import it into Your Favourite IDE**

```bash
git clone https://github.com/flabdev/Spring-Boot-Starter.git
```

## Building and running the application

### Setting Up Local Properties File

In Your project go to src/main/resources 
Copy the application.properties file in any location, rename to application-local.properties and add the necessary values in the file to setup mysql 
and other service


## Project execution 

### Building the application

The project uses [Gradle](https://gradle.org) as a build tool.

To build the project execute the following command:

```bash
  ./gradlew build
```

### Generating checkstyle report

To generate checkstyle report execute the following command:

```bash
  ./gradlew checkstyleMain
```

The report will be created in build/reports/chekstyle/main.html location in your project directory.

### Generating pmd report

To generate pmd report execute the following command:

```bash
  ./gradlew pmdMain
``` 

The report will be created in build/reports/pmd/main.html location in your project directory.
    
### Generating jacoco report

To generate jacoco report execute the following command:

```bash
  ./gradlew jacocoTestReport
``` 

The report will be created in build/jacocoHtml/index.html location in your project directory.

### Creating jar file

To create .jar file of application execute the following command:

```bash
  ./gradlew clean build
``` 

or 

```bash
  ./gradle clean build
``` 

It will generate  .jar file for our application in build/libs/ subdirectory. 

along with this it will also generate JaCoco report, checkstyle report, pmd report for our application in below location  

jacoco report location build/jacocoHtml/index.html

checkstyle report location build/reports/checkstyle/main.html

pmd report location pmd/build/reports/pmd/main.html

jar file location build/libs/Spring-Boot-Starter-0.0.1-SNAPSHOT.jar

### Running the application

To run the project execute the following command:

```bash
  java -jar build/libs/Spring-Boot-Starter-0.0.1-SNAPSHOT.jar --spring.profile.active=local --spring.config.location=@YourApplicationPropertiesLocation
```

or 

```bash
  ./gradlew bootRun --args='--spring.profiles.active=local --spring.config.location=@PropertiesFileLocation'
```

App Will be run on port 9090 

Open the Postman and verify 

## [Integrate sonarqube into the springboot project](https://github.com/flabdev/Spring-Boot-Starter/wiki)

**We need JAVA 11 or 17 for sonarqube**

**To run sonarqube**

```bash
./gradlew sonar -D "sonar.projectKey=Spring-Boot-Starter" -D "sonar.host.url=http://localhost:9000" -D "sonar.login={token generated while integeration}"
```
To check your code quality go to your browser
where sonarqube is running http://localhost:9000
go to your project and See the status of code


# Dockerizing Spring-Boot-Starter project 

Step1:  
pull the mysql image from docker hub
```bash
docker pull mysql
```

Step2:  
create a docker network to communicate Springboot app and MySql database

```bash
docker network create springboot-mysql-net
```
To verify

```bash
docker network ls
```

Step3:
Run the mysql container in the network in created network in detach mode
```bash
docker run --name mysqldb --network springboot-mysql-net -e MYSQL_ROOT_PASSWORD=1234 -e MYSQL_DATABASE=student -e MYSQL_USER=sa -e MYSQL_PASSWORD=1234 -d mysql:latest
```
To verify
```bash
docker ps
```

Step4:
Run Mysql in interactive mode

```bash
docker exec -it [containerid] bash
```
after that type

```bash
mysql -usa -p1234
```


Step5:
update application.properties file of our application according to docker mysql configuration and provide username, password and url according to docker mysql configuration 

```bash

spring.datasource.url=jdbc:mysql://mysqldb:3306/student
spring.datasource.username=sa
spring.datasource.password=1234
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect
server.port=9090

```

Step6:
generate the .jar file for our  spring boot application by running below command 

```
gradle clean build
```

Step7: 
Build your the docker image by running below command 

```bash
docker build -t springbootstarter .
```
To verify

```bash
docker images
```
Step7:
Start the springboot container on the same network in detached mode exposing the host port and container port on 9090.


```bash
docker run --network springboot-mysql-net --name springboot-container -p 9090:9090 -d springbootstarter
```




















# Testcontainers SpringBoot
This quick starter will guide you to configure and use Testcontainers in a SpringBoot project.

## 1. Setup Environment
Make sure you have Java 8+ and a [compatible Docker environment](https://www.testcontainers.org/supported_docker_environment/) installed.
If you are going to use Maven or gradle build tool then make sure Java 17 or higher version is installed.



For example:
```shell
$ java -version
openjdk version "17.0.4" 2022-07-19
OpenJDK Runtime Environment Temurin-17.0.4+8 (build 17.0.4+8)
OpenJDK 64-Bit Server VM Temurin-17.0.4+8 (build 17.0.4+8, mixed mode, sharing)

$ docker version
... 
Server: Docker Desktop 4.12.0 (85629)
 Engine:
  Version:          20.10.17
  API version:      1.41 (minimum version 1.12)
  Go version:       go1.17.11
...

```

## 2. Run Tests


The sample project uses JUnit tests and Testcontainers to run them against actual databases running in containers.

Run the command to run the tests.
```shell
$ ./gradlew test //for Gradle
$ ./mvnw verify  //for Maven
```

The tests should pass.

# Consumer Driven Contracts with Pact
This quick starter will guide you to configure and use Testcontainers in a SpringBoot project.

## 1. Setup Environment
Make sure you have Java 8+ and a [compatible Docker environment](https://www.testcontainers.org/supported_docker_environment/) installed.
If you are going to use Maven build tool then make sure Java 17+ is installed.

## 2. Generate the pact file
Use the below gradle command to verify the contracts
```shell
$ ./gradle test --tests PactConsumerJUnit5Test
```
Pact file should generated under path
```
/build/pacts/UserConsumer-UserServiceJUnit5.json
```

## 3. Verifying contracts
Use the below gradle command to verify the contracts
```shell
$ ./gradle pactVerify
```
The tests should pass.

## 4. Running a Pact Broker locally
The pact broker requires a postgres database to work, so use docker compose to spin up and configure containers.

## 5. Publishing Pact contracts
Use the below command to publish the generated contracts
```shell
$ ./gradle pactPublish
```
Go to a browser and visit http://localhost:9292/ to open the broker web UI.

## 6. Retrieving and verifying contracts
Use the below command to publish the generated contracts
```shell
$ ./gradle pactVerify
```
