FROM openjdk:17-jdk-slim
WORKDIR app
COPY target/ecommerce-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "app/ecommerce-0.0.1-SNAPSHOT.jar"]
