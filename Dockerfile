# Use OpenJDK 17 base image
FROM openjdk:17

# Copy the built JAR file into the container
COPY target/spring-boot-crud-0.0.1-SNAPSHOT.jar app.jar

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/app.jar"]