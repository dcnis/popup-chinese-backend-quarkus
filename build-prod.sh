#!/bin/bash

mvn package -Dnative -Dquarkus.native.container-build=true

docker build -f src/main/docker/Dockerfile.native-micro -t dcnis/popup-chinese-backend-quarkus .

echo "keycloak configuration"
docker run -p 8443:8443 \
-v /Users/dschmidt/Documents/cert/popup-chinese-keycloak/keycloak-cert.pem:/etc/keycloak-cert.pem \
-v /Users/dschmidt/Documents/cert/popup-chinese-keycloak/keycloak-private-key.pem:/etc/keycloak-key.pem \
-e KEYCLOAK_ADMIN=admin \
-e KEYCLOAK_ADMIN_PASSWORD=admin \
--name keycloak \
quay.io/keycloak/keycloak:latest \
start \
--https-certificate-file=/etc/keycloak-cert.pem \
--https-certificate-key-file=/etc/keycloak-key.pem \
--hostname-strict=false

echo "spin-up backend"
docker run -i --rm -p 8080:8080 \
-e DB_USERNAME=admin \
-e DB_PASSWORD=secret \
-e DB_URI=jdbc:postgresql://192.168.240.2:5432/popupchinese \
-e KEYCLOAK_CLIENT_ID=backend-service \
-e KEYCLOAK_CLIENT_SECRET=secret \
-e KEYCLOAK_URL=https://192.168.240.3:8443/realms/quarkus \
--name app \
dcnis/popup-chinese-backend-quarkus

