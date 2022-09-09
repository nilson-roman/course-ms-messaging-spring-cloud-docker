FROM maven:3.8.5-openjdk-17 as build

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

FROM openjdk:11

ARG eurekapass

ENV EUREKAPASS $eurekapass

ARG rabbituser

ENV RABBITUSER $rabbituser

ARG rabbitpass

ENV RABBITPASS $rabbitpass

WORKDIR /app

COPY --from=build ./app/target/*.jar ./app.jar

ENTRYPOINT java -jar app.jar
