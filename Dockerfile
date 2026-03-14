FROM eclipse-temurin:25

COPY ./target/ecommerce-0.0.1-SNAPSHOT.jar /app.jar

COPY ./grafana-opentelemetry-java.jar /grafana-opentelemetry-java.jar

# Step 4: Expose the port your application runs on
EXPOSE 9090

ENTRYPOINT ["java","-jar","/app.jar"]