FROM openjdk:11-jre-slim
COPY /build/libs/otmdataapp-0.0.1-SNAPSHOT.jar .
CMD java -jar otmdataapp-0.0.1-SNAPSHOT.jar