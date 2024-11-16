FROM maven:3.8.5-openjdk-17-slim AS builder
WORKDIR /app
COPY . .
RUN mvn clean install
EXPOSE 8080
ENTRYPOINT ["java","-jar","target/kuberDemo-0.0.1-SNAPSHOT.jar"]