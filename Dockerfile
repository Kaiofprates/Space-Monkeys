FROM openjdk

WORKDIR /app

COPY out/artifacts/farmbox_jar/farmbox.jar /app/farmbox.jar

ENTRYPOINT ["java","-jar", "farmbox.jar"]

