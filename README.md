# Popup-Chinese-Backend-Quarkus

This project is the popup-chinese backend and uses Quarkus, Docker, Maven, PostgreSQL and Redis.

## Prerequisites
1. JDK 11+ installed with JAVA_HOME configured appropriately
2. Apache Maven 3.9.3
3. Docker container runtime
4. Optionally Mandrel or GraalVM installed

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
mvn compile quarkus:dev
```

## Creating a native executable

You can create a native executable with GraalVM using: 
```shell script
mvn package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
mvn package -Dnative -Dquarkus.native.container-build=true
```
You can then execute your native executable with: `./target/popup-chinese-backend-quarkus-1.0.0-SNAPSHOT-runner`

## Spin up the app with docker-compose

After you created the native executable, you can spin up the app using:
```batch
docker compose up
```

## Development workflow
See our [Cheat Sheet](CheatSheet.md) for our development workflow.

