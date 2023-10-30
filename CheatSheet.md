# Cheat Sheet

# Development workflow

## 1. Build your app in development mode

```bash
mvn compile quarkus:dev
```

## 2. Produce a native executable
### With GraalVM (preferably and faster)
```bash
mvn package -Dnative -Dquarkus.native.container-build=true
```

#### Or without GraalVM
```bash
mvn clean package -Dnative -Dquarkus.native.container-build=true -Dquarkus.container-image.build=true -Dquarkus.profile=prod
```



## 3. Build the docker image
Based on the `Dockerfile.native-micro`, create a docker image.
    
```bash
docker build -f src/main/docker/Dockerfile.native-micro -t dcnis/popup-chinese-backend-quarkus .
```

## 4. Run the docker image
Preferably use `docker-compose` to run your container. It uses the `docker-compose.yml` in the root folder.
This way all servics are within the same network and the backend can wait for the postgresql and keycloak services.
This will spin up the entire app with the quarkus app, PostgreSQL DB and redis.
```bash
docker compose up
```
Or run the backend quarkus app image manually via `docker run`
```bash
docker run -i --rm -p 8080:8080 -e DB_USERNAME=postgres -e DB_PASSWORD=postgres -e DB_URI=jdbc:postgresql://172.17.0.2:5432/postgres dcnis/popup-chinese-backend-quarkus
```

## 5. Push the docker image to Docker Hub

```bash
docker push dcnis/popup-chinese-backend-quarkus
```

# Connect to RDS PostgreSQL from EC2 instance

```bash
psql \
--host=<DB instance endpoint> \
--port=<port> \
--username=<master username> \
--password \
--dbname=<database name> 
```

# DynamoDB

## Run DynamoDB locally in docker
```bash
docker run --publish 4566:8000 --name dynamodb amazon/dynamodb-local:1.22.0 -jar DynamoDBLocal.jar -inMemory -sharedDb
```

## Check DynamoDB tables
```bash
aws dynamodb list-tables --endpoint-url http://localhost:4566
```

## Create DynamoDB table
```bash
aws dynamodb create-table --table-name QuarkusFruits \
                          --attribute-definitions AttributeName=fruitName,AttributeType=S \
                          --key-schema AttributeName=fruitName,KeyType=HASH \
                          --provisioned-throughput ReadCapacityUnits=1,WriteCapacityUnits=1
```

# Keycloak

## Run keycloak in docker
See also: [Keycloak-Guide](https://www.keycloak.org/getting-started/getting-started-docker)
```bash
docker run -p 8543:8443 -v "$(pwd)"/config/keycloak-keystore.jks:/etc/keycloak-keystore.jks --name keycloak -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:22.0.5 start --hostname-strict=false --https-key-store-file=/etc/keycloak-keystore.jks
```

## Check IP-address of docker container
```bash
docker inspect \
  -f '{{range.NetworkSettings.Networks}}{{.IPAddress}}{{end}}' container_name_or_id
```
