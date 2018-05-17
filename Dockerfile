FROM openjdk:8-jre-alpine
ENV AWS_REGION=us-east-1
ENV AWS_ACCESS_KEY_ID=xxx
ENV AWS_SECRET_ACCESS_KEY=xxx
COPY ./target/printer-api-java-spring-0.0.1-SNAPSHOT.jar /usr/src/printer-api-java-spring/
WORKDIR /usr/src/printer-api-java-spring
EXPOSE 8111
CMD ["java", "-jar", "printer-api-java-spring-0.0.1-SNAPSHOT.jar"]