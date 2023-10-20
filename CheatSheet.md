# Cheat Sheet

## Development workflow

### 1. Build your app in development mode

```bash
mvn compile quarkus:dev
```

### 2. Produce a native executable
```bash
mvn clean package -Dnative -Dquarkus.native.container-build=true -Dquarkus.container-image.build=true -Dquarkus.profile=prod
```

### 3. Build the docker image
Based on the `Dockerfile.native-micro`, create a docker image.

```bash
docker build -f src/main/docker/Dockerfile.native-micro -t dcnis/popup-chinese-backend-quarkus .
```

### 4. Run the docker image
Preferably use `docker-compose` to run your container. It uses the `docker-compose.yml` in the root folder.
This will spin up the entire app with the quarkus app, PostgreSQL DB and redis.
```bash
docker compose up
```
Or run the backend quarkus app image manually via `docker run`
```bash
docker run -i --rm -p 8080:8080 dcnis/popup-chinese-backend-quarkus 
```

### 5. Push the docker image to Docker Hub

```bash
docker push dcnis/popup-chinese-backend-quarkus
```

## Connect to RDS PostgreSQL from EC2 instance

```
psql \
--host=<DB instance endpoint> \
--port=<port> \
--username=<master username> \
--password \
--dbname=<database name> 
```
