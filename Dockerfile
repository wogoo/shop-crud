FROM openjdk:11
ADD target/kotlin-crud-shop.jar kotlin-crud-shop.jar
ENTRYPOINT ["java", "-jar","kotlin-crud-shop.jar"]
EXPOSE 8080