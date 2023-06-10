FROM openjdk:17-jdk-alpine

RUN apk add --no-cache bash

WORKDIR /valorant-lfg

CMD ./gradlew run