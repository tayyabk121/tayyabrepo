# Use OpenJDK 24 slim image
FROM eclipse-temurin:24-jdk-slim


# Set working directory
WORKDIR /app

# Copy JAR file into the container
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expose default Spring Boot port
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
