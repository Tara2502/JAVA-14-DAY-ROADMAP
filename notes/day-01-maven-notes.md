\# Day 6 – Maven Complete Notes



\## What is Maven?



Maven is a \*\*Build Automation and Dependency Management Tool\*\* for Java projects.



It automates the software build process and manages external libraries (dependencies).



\---



\# Why was Maven created?



Before Maven, developers had to:



\* Compile source code manually.

\* Download JAR files manually.

\* Manage library versions themselves.

\* Maintain different project structures.



Maven solved these problems by providing:



\* Standard project structure

\* Automatic dependency management

\* Build automation

\* Consistent project configuration



\---



\# Maven Standard Directory Structure



```

project/

│

├── pom.xml

│

├── src

│   ├── main

│   │   ├── java

│   │   └── resources

│   │

│   └── test

│       ├── java

│       └── resources

│

└── target

```



\## Purpose of folders



\### src/main/java



Contains production source code.



\### src/main/resources



Contains configuration files and resources.



Example:



\* application.properties

\* logback.xml

\* JSON files



\### src/test/java



Contains JUnit test classes.



\### src/test/resources



Contains resources used only during testing.



\### target/



Contains generated build artifacts.



Can be deleted safely.



\---



\# Build Lifecycle



```

validate

&#x20;   ↓

compile

&#x20;   ↓

test

&#x20;   ↓

package

&#x20;   ↓

verify

&#x20;   ↓

install

&#x20;   ↓

deploy

```



\## validate



Checks whether the project is correctly configured.



\## compile



Compiles Java source code.



Produces:



```

.class

```



Uses:



\* Maven Compiler Plugin

\* javac



\---



\## test



Runs JUnit tests.



Uses:



\* Maven Surefire Plugin



If any test fails:



\* Build stops.

\* JAR is not created.



\---



\## package



Packages compiled code into a distributable artifact.



Default artifact:



```

.jar

```



Uses:



\* Maven JAR Plugin



\---



\## verify



Runs additional verification checks after packaging.



\---



\## install



Copies the generated artifact into the Local Repository.



Location:



```

C:\\Users\\<username>\\.m2\\repository

```



Other local Maven projects can now use this artifact.



\---



\## deploy



Publishes the artifact to a configured remote repository for other developers or systems to use.



\---



\# pom.xml



The Project Object Model (POM).



It contains the project's configuration.



Important tags:



```

<project>

```



Root element.



\---



```

<modelVersion>

```



Defines the POM model version.



Usually:



```

4.0.0

```



\---



```

<groupId>

```



Organization or company identifier.



Example:



```

com.tara

```



\---



```

<artifactId>

```



Project name.



Example:



```

expense-tracker

```



\---



```

<version>

```



Project version.



Example:



```

1.0-SNAPSHOT

```



\---



```

<dependencies>

```



Contains all external libraries.



\---



```

<properties>

```



Stores reusable values.



Example:



```

<junit.version>5.13.4</junit.version>

```



Advantages:



\* Centralized version management

\* Easy upgrades

\* Better readability



\---



```

<build>

```



Contains build configuration.



Usually contains plugins.



\---



```

<plugins>

```



Defines plugins used during the build process.



\---



\# Dependency Management



A dependency is an external library required by the project.



Example:



\* Jackson

\* JUnit

\* Logback



\---



\## Direct Dependency



Added manually inside pom.xml.



Example:



```

jackson-databind

```



\---



\## Transitive Dependency



Automatically downloaded because another dependency requires it.



Example:



```

jackson-databind

&#x20;     │

&#x20;     ├── jackson-core

&#x20;     └── jackson-annotations

```



\---



\# Maven Central



Default public repository from which Maven downloads dependencies.



Flow:



```

pom.xml

&#x20;    ↓

Local Repository (.m2)

&#x20;    ↓

Not Found

&#x20;    ↓

Maven Central

&#x20;    ↓

Download

&#x20;    ↓

Store in .m2

```



\---



\# Local Repository



Location:



```

C:\\Users\\<username>\\.m2\\repository

```



Purpose:



\* Stores downloaded dependencies.

\* Speeds up future builds.

\* Enables offline builds (for already downloaded dependencies).



\---



\# Version Conflict



Occurs when different dependencies require different versions of the same library.



Maven resolves conflicts by selecting one version (commonly the nearest dependency in the dependency tree).



\---



\# Plugins



\## Compiler Plugin



Purpose:



Compiles Java source code.



Flow:



```

.java

&#x20;    ↓

Compiler Plugin

&#x20;    ↓

javac

&#x20;    ↓

.class

```



\---



\## Surefire Plugin



Purpose:



\* Discovers test classes

\* Executes JUnit tests

\* Generates test reports



Reports stored in:



```

target/surefire-reports

```



\---



\## JAR Plugin



Packages compiled classes and resources into a JAR file.



Runs during:



```

package

```



\---



\# Build Artifacts



\## .class



Compiled Java bytecode.



Stored in:



```

target/classes

```



\---



\## test-classes



Compiled JUnit test classes.



Stored in:



```

target/test-classes

```



\---



\## target/



Contains all generated build artifacts.



Examples:



\* classes

\* test-classes

\* surefire-reports

\* generated-sources

\* .jar



\---



\## JAR



Java Archive.



Contains:



\* Compiled classes

\* Resources

\* META-INF

\* MANIFEST.MF

\* Maven metadata



Does NOT contain:



\* .java source files

\* Test classes



\---



\## Executable JAR



Contains:



```

META-INF/MANIFEST.MF

```



with



```

Main-Class

```



which tells Java where execution should begin.



\---



\# Clean Build



Command:



```

mvn clean

```



Deletes:



```

target/

```



Benefits:



\* Removes stale artifacts

\* Ensures a fresh build

\* Avoids build inconsistencies



\---



\# Maven Commands Practiced



```

mvn compile

```



Compiles source code.



\---



```

mvn test

```



Compiles and executes tests.



\---



```

mvn package

```



Creates the JAR.



\---



```

mvn install

```



Copies the artifact into the Local Repository.



\---



\# Hands-on Completed



✅ Created a Maven project



✅ Added dependencies manually



✅ Used properties



✅ Used plugins



✅ Executed Maven lifecycle commands



✅ Generated JAR



✅ Inspected JAR contents



✅ Viewed MANIFEST.MF



✅ Verified target folder



✅ Verified .m2 local repository



\---



\# Key Interview Points



\* Maven automates builds and manages dependencies.

\* `pom.xml` is Maven's configuration file.

\* `target/` contains generated artifacts and can be deleted safely.

\* Compiler Plugin invokes `javac`.

\* Surefire Plugin executes JUnit tests.

\* JAR Plugin creates the distributable JAR.

\* Transitive dependencies are downloaded automatically.

\* Maven Central is the default public repository.

\* `.m2` is the local repository.

\* `mvn install` copies artifacts to the local repository.

\* Maven lifecycle phases execute in order.



