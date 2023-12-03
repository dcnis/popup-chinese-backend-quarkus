# Popup-Chinese-Backend-Quarkus

This project is the popup-chinese backend and uses Quarkus, Docker, Maven, PostgreSQL and Redis.

## Prerequisites
1. JDK17 installed with JAVA_HOME configured appropriately
2. Apache Maven 3.9.3
3. Docker container runtime
4. Optionally Mandrel or GraalVM installed

Make sure your docker application `popup-chinese-backend-quarkus` is running with following containers. If not, run `docker-compose.yml`.
```
keycloak
postgres-15
```

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
mvn compile quarkus:dev
```

### Keycloak
Keycloak is running at `https://localhost:8443/` with the default user `admin` and default password `admin`.
There is a client `backend-service`, which configures access under `Authorization` using `Resources` and `Policies` and `Permissions`.

#### Log in to keycloak

**getAccessToken**<br>
URL: `https://localhost:8443/realms/quarkus/protocol/openid-connect/token` <br>
Body: `x-www-form-urlencoded`
```bash
client_id: backend-service
username: alice@mail.com
password: test
grant_type: password
client_secret: secret
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

