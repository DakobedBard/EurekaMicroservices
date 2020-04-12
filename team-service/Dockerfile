FROM maven:3-jdk-11

WORKDIR /app
COPY . /app
RUN mvn -v
# RUN mvn clean install
EXPOSE 8080
ADD ./target/team-service-0.0.1-SNAPSHOT.jar team-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","team-service-0.0.1-SNAPSHOT.jar"]
