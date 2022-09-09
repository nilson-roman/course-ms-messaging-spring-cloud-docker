FROM maven:3.8.5-openjdk-17 as build

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

FROM openjdk:11

ARG EUREKAPASS_ARG

ENV EUREKAPASS $EUREKAPASS_ARG

WORKDIR /app

COPY --from=build ./app/target/*.jar ./app.jar

EXPOSE 8761

ENTRYPOINT java -jar app.jar
