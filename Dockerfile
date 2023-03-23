FROM openjdk
LABEL maintainer = loanapp.com
ADD target/loanapp-0.0.1-SNAPSHOT.jar loanapp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "loanapp-0.0.1-SNAPSHOT.jar"]