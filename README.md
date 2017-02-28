Overview
========
This is a starter project using jax-rs/jersey.

How-to run
==========
0.1) Requisites

You will need the following installed:
Java

If you are on a mac, I recommend to do the following:
install homebrew (see: http://brew.sh/)
from command line, install java:
`brew install java'

1) Run the jetty container
The project compiles using gradle. There's a gradle wrapper included in this source:
```
./gradlew jettyRun
```

2) Hit some of the included rest endpoints:
```
curl localhost:8080/jersey-starter/ws/hello
```

The supported endpoints are:
```
http://localhost:8080/jersey-starter/ws/json
```
```
http://localhost:8080/jersey-starter/ws/json/all
```
```
http://localhost:8080/jersey-starterkit/ws/echo?m=hello
```
```
http://localhost:8080/jersey-starterkit/ws/hello
```


Opening in Eclipse
==================
If you use Eclipse, the gradle scripts are nice enough to create your eclipse project and classpath files.

First time only
---------------
Run:
```
./gradlew eclipse
```

Now you can import the project into eclipse.


Updating classpath files
------------------------
If you update dependencies, pull the new libs into your classpath:
```
./gradlew eclipseClasspath
```

Logging
=======
There is a log4j configuration defined in `src/main/resources/log4j.properties`.  By default this will log to the STDOUT.  Change the logging configuration as needed.

