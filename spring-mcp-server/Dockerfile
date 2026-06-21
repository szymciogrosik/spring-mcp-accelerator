# --- Build stage ---
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /build
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# --- Run stage ---
FROM eclipse-temurin:21-jre-jammy

WORKDIR /app
COPY --from=build /build/target/mcp-server.jar /app/mcp-server.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/mcp-server.jar"]
