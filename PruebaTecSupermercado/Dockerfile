FROM eclipse-temurin:17-jdk-alpine
ARG JAR_FILE=target/PruebaTecSupermercado-0.0.1.jar
COPY ${JAR_FILE} app_pruebatecsuper.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_pruebatecsuper.jar"]