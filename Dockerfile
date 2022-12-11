FROM openjdk:11
EXPOSE 8080
ADD C:\Projects\javaproj\.mvn\wrapper\maven-wrapper.jar maven-wrapper.jar
ENTRYPOINT ["java", "-jar", "/maven-wrapper.jar"]