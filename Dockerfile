FROM openjdk:8
WORKDIR /usr/src/
COPY target/pokemon-api-0.0.1-SNAPSHOT.jar /usr/src/
CMD ["java", "-jar", "/usr/src/pokemon-api-0.0.1-SNAPSHOT.jar"]