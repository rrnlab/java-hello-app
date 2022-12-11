FROM openjdk:11
EXPOSE 8080
ADD C:\Projects\javaproj\src\main\java\com\example\springboothello\HelloWorldController.java HelloWorldController.java
ENTRYPOINT ["java", "-jar", "HelloWorldController.java"]