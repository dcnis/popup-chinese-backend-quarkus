# Cheat Sheet

## Development workflow

### 1. Build your app in development mode

```
mvn compile quarkus:dev
```

### 2. Produce a native executable
```
mvn package -Dnative -Dquarkus.native.container-build=true -Dquarkus.container-image.build=true
```

### 3. Build the docker image
Based on the `Dockerfile.native-micro`, create a docker image.

```bat
docker build -f src/main/docker/Dockerfile.native-micro -t dcnis/popup-chinese-backend-quarkus .
```

### 4. Run the docker image

```bat
docker run -i --rm -p 8080:8080 dcnis/popup-chinese-backend-quarkus 
```

### 5. Push the docker image to Docker Hub

```
docker push dcnis/popup-chinese-backend-quarkus
```
