FROM eclipse-temurin:17
COPY target/jendemo.jar jendemo.jar
CMD [ "java", "-jar", "jendemo.jar" ]