FROM openjdk:8
EXPOSE 8081
ADD target/accounting-0.0.1.jar accounting-0.0.1.jar
ENTRYPOINT ["java", "-jar", "accounting-0.0.1.jar"]
