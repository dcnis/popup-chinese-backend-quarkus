#!/bin/bash

mvn package -Dnative -Dquarkus.native.container-build=true

docker build -f src/main/docker/Dockerfile.native-micro -t dcnis/popup-chinese-backend-quarkus .

docker run -i --rm -p 8080:8080 -e DB_USERNAME=postgres -e DB_PASSWORD=postgres -e DB_URI=jdbc:postgresql://172.17.0.2:5432/postgres dcnis/popup-chinese-backend-quarkus
