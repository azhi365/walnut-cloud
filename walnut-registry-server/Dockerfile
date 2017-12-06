FROM java:8u111

VOLUME /tmp

COPY target/walnut-registry-server-0.0.1-SNAPSHOT-exec.jar /app.jar

EXPOSE 7777

ENTRYPOINT ["java","-jar" ,"-Dspring.profiles.active=server-1","/app.jar"]
