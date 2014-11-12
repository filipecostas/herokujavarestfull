# Embedded Jetty template application

This is a template for a web application that uses embedded Jetty. The sample code consists of a JSP (this page) and a simple servlet.

# JAX-RS Template Application

This is a template for a lightweight RESTful API using JAX-RS. The sample code is a call for getting the current time.

## This template includes example local Maven repository.

See https://devcenter.heroku.com/articles/local-maven-dependencies and pom.xml's `<repositories/>` and `<dependency/>`.

## Running the application locally

First build with:

    $mvn clean install

Then run it with:

    $java -cp target/classes:target/dependency/* com.example.Main


Usage
-----

Example usage:

    $ ls
    Procfile  pom.xml  src

    $ heroku create --stack cedar --buildpack http://github.com/heroku/heroku-buildpack-java.git

    $ git push heroku master
    ...
    -----> Heroku receiving push
    -----> Fetching custom language pack... done
    -----> Java app detected
    -----> Installing OpenJDK 1.6... done
    -----> Installing Maven 3.0.3... done
    -----> Installing settings.xml... done
    -----> executing /app/tmp/repo.git/.cache/.maven/bin/mvn -B -Duser.home=/tmp/build_19z6l4hp57wqm -Dmaven.repo.local=/app/tmp/repo.git/.cache/.m2/repository -s /app/tmp/repo.git/.cache/.m2/settings.xml -DskipTests=true clean install
           [INFO] Scanning for projects...
           [INFO]                                                                         
           [INFO] ------------------------------------------------------------------------
           [INFO] Building readmeTest 1.0-SNAPSHOT
           [INFO] ------------------------------------------------------------------------
    ...

