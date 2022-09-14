# Application

This application provides a REST Web API to manage drones used for delivery of medications.

## Language and Framework

The application uses the Spring Boot framework for the Java programming language.

## Downloading and Running

The application uses maven for dependency/package management. To build and run the application, download/clone the code into a folder and run the following command:
`mvnw spring-boot:run`
The command needs to be run from the folder in which you downloaded the code. 

## Configuration

The file `application.properties` found in folder `src/main/resources` contains necessary configuration parameters. One of them is `server.port` which is initially set to the value 8080. You can change it if you like.

## Storage

The application uses the H2 embedded database so that there is no need to install a separate database engine.
