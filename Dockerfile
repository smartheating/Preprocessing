FROM java:8-jdk-alpine
VOLUME /tmp
EXPOSE 9015
ARG JAR_FILE=target/preprocessing-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} preprocessing.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=docker","-jar","/preprocessing.jar"]