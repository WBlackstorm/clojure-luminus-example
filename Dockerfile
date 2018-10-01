FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/clj-web-app.jar /clj-web-app/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/clj-web-app/app.jar"]
