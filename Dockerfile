FROM openjdk:11
EXPOSE 8080
ADD target/store_management_api.jar store_management_api.jar
ENTRYPOINT ["java", "-jar", "/store_management_api.jar"]