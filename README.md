# Getting Started

This is a simple "Hello World" application exposed as rest service using Spring-boot framework. The goal here is to generate necessary yaml files and deploy the application to an Openshift cluster.

In order to use dekorate in your Spring-boot application, just add the following dependency to your project pom.xml.
```
<dependency>
    <groupId>io.dekorate</groupId>
    <artifactId>openshift-spring-starter</artifactId>
    <version>0.10.10</version>
</dependency>
```


To build the application:

`mvn clean package -Ddekorate.build=true`

To deploy the application (requires an running Openshift instance):

`mvn clean package -Ddekorate.deploy=true`

You can add extra configurations via [application.properties](./src/main/resources/application.properties) or annotating it directly into the application.
All available configurations can be found [here](http://dekorate.io/dekorate/assets/config.html).

### Reference Documentation
For further reference, please consider the following sections:

* [Dekorate Getting Started Page](https://dekorate.io/getting-started)

