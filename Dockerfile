FROM 100.125.17.64:20202/hwcse/dockerhub-java:8-jre-alpine

WORKDIR /home/apps/
ADD target/cse-spring-demo-0.0.1-snapshot.jar .

ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]