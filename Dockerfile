FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/SBFO_prod.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar", "--server.address=0.0.0.0"]