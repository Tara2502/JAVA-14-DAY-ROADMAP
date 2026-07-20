\# Day 06 – Maven Deep Dive



\## Overview



This project contains the practical implementation and examples covered while learning Maven fundamentals.



The goal of this module was to understand not only \*\*how\*\* Maven works but also \*\*why\*\* it is used in modern Java development.



\---



\## Topics Covered



\### Maven Fundamentals



\* What is Maven?

\* Why Maven was created

\* Standard Project Structure

\* Build Automation

\* Dependency Management



\### pom.xml



\* project

\* modelVersion

\* groupId

\* artifactId

\* version

\* dependencies

\* properties

\* build

\* plugins



\### Maven Lifecycle



\* validate

\* compile

\* test

\* package

\* verify

\* install

\* deploy



\### Dependency Management



\* Direct Dependencies

\* Transitive Dependencies

\* Maven Central

\* Local Repository (.m2)

\* Version Conflicts

\* Updating Dependencies



\### Plugins



\* Maven Compiler Plugin

\* Maven Surefire Plugin

\* Maven JAR Plugin



\### Build Artifacts



\* .class files

\* target/

\* test-classes/

\* JAR files

\* MANIFEST.MF

\* Executable JAR

\* Clean Build



\---



\## Maven Commands Practiced



```bash

mvn compile

mvn test

mvn package

mvn install

```



\---



\## Project Structure



```

day-06-maven/

│

├── pom.xml

├── src

│   ├── main

│   │   ├── java

│   │   └── resources

│   └── test

│       ├── java

│       └── resources

└── target

```



\---



\## Learning Outcome



After completing Day 6, I can:



\* Create and configure a Maven project.

\* Understand the purpose of every major `pom.xml` tag.

\* Explain the Maven build lifecycle.

\* Manage dependencies effectively.

\* Understand transitive dependencies and Maven Central.

\* Use Maven plugins for compilation, testing, and packaging.

\* Generate and inspect JAR files.

\* Execute Maven commands from the terminal.

\* Understand the purpose of the local Maven repository (`.m2`).



\---



\## Technologies Used



\* Java 21

\* Maven

\* JUnit 5

\* Jackson Databind



\---



\## Author



\*\*Tara Chaurasiya\*\*



