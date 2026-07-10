\# Day 05 - File I/O, JSON, Layered Architecture \& JUnit 5



\## Topics Covered



\* File I/O

\* Path API

\* Files API

\* Character Streams

\* Byte Streams

\* FileReader

\* FileWriter

\* BufferedReader

\* BufferedWriter

\* Try-With-Resources

\* JSON

\* Serialization

\* Deserialization

\* Jackson Library

\* ObjectMapper

\* Layered Architecture

\* Repository Pattern

\* JUnit 5 Fundamentals



\---



\# Part 1 - File I/O



\## What is File I/O?



File I/O (Input/Output) is the process of reading data from files and writing data to files.



\---



\## Why do we need File I/O?



Applications cannot rely only on RAM because RAM is temporary.



When the application closes, all in-memory data is lost.



File storage provides permanent persistence.



Examples:



\* Expense Tracker

\* Banking System

\* Student Management System

\* Inventory System



\---



\## RAM vs File Storage



| RAM                          | File Storage                    |

| ---------------------------- | ------------------------------- |

| Temporary                    | Permanent                       |

| Very Fast                    | Slower                          |

| Data lost after program ends | Data remains after program ends |



\---



\## What are Streams?



A stream is a channel through which data flows between a Java program and a file.



\### Input Stream



Used to read data from a file.



```text

File

&#x20;  ↓

Java Program

```



\### Output Stream



Used to write data to a file.



```text

Java Program

&#x20;  ↓

File

```



\---



\## Files vs Streams



\*\*File\*\*



Represents the actual storage location.



\*\*Stream\*\*



Represents the flow of data to or from the file.



\---



\# Path API



Package:



```java

java.nio.file

```



\### Why Path API?



\* Platform independent

\* Cleaner than old File API

\* Better support for file operations



Example:



```java

Path path = Paths.get("notes.txt");

```



Useful methods:



\* getFileName()

\* getParent()

\* toAbsolutePath()



\---



\# Relative Path vs Absolute Path



\### Relative Path



```text

notes.txt

```



Starts from the current project directory.



\### Absolute Path



```text

C:\\Users\\HP\\Documents\\notes.txt

```



Complete path from the root of the system.



\---



\# Files API



Class:



```java

Files

```



Common methods:



\* exists()

\* createFile()

\* createDirectory()

\* createDirectories()

\* readString()

\* readAllLines()

\* write()

\* copy()



\---



\## readString()



Returns the complete file as one String.



Suitable for:



\* Small files

\* Configuration files

\* Notes



\---



\## readAllLines()



Returns:



```java

List<String>

```



Each line becomes one String.



Suitable for:



\* Small structured text files

\* Configuration files



\---



\# Character Streams



Used for text data.



Examples:



\* TXT

\* CSV

\* JSON

\* XML



Classes:



\* FileReader

\* FileWriter



\---



\# Byte Streams



Used for binary data.



Examples:



\* Images

\* Videos

\* PDFs

\* Audio



\---



\# FileReader



Reads one character at a time.



Pros:



\* Easy to understand



Cons:



\* Slow for large files



\---



\# BufferedReader



Wraps FileReader.



Reads data into a memory buffer first, reducing disk access.



Advantages:



\* Faster

\* Efficient

\* readLine() support



Important methods:



\* readLine()

\* close()



EOF:



```java

while((line = reader.readLine()) != null)

```



\---



\# FileWriter



Writes characters to a file.



Default behavior:



Overwrites existing content.



Append mode:



```java

new FileWriter("notes.txt", true);

```



\---



\# BufferedWriter



Wraps FileWriter.



Advantages:



\* Faster writing

\* Uses internal buffer

\* Supports newLine()



Useful methods:



\* write()

\* newLine()

\* flush()

\* close()



\---



\# flush() vs close()



flush()



\* Writes buffered data to the file

\* Writer can still be used



close()



\* Flushes remaining data

\* Releases resources

\* Writer cannot be used again



\---



\# Try-With-Resources



Syntax:



```java

try(Resource resource = ...)

{

}

```



Advantages:



\* Automatically closes resources

\* Prevents resource leaks

\* Cleaner code



Works with:



AutoCloseable



Examples:



\* BufferedReader

\* BufferedWriter

\* FileReader

\* FileWriter



\---



\# Best Practices



\* Always close resources.

\* Prefer BufferedReader over FileReader for text files.

\* Prefer BufferedWriter over FileWriter for large writes.

\* Use UTF-8 encoding.

\* Catch specific exceptions.

\* Never leave catch blocks empty.



\---



\# Part 2 - JSON



\## What is JSON?



JSON stands for:



JavaScript Object Notation



A lightweight format used for data exchange.



\---



\## Why JSON?



\* Human readable

\* Easy to parse

\* Lightweight

\* Platform independent

\* Supported by almost every programming language



\---



\## JSON Object



```json

{

&#x20; "name":"Tara",

&#x20; "age":26

}

```



Uses:



{}



\---



\## JSON Array



```json

\[

&#x20; {},

&#x20; {}

]

```



Uses:



\[]



\---



\# Serialization



Converting:



Java Object



↓



JSON



\---



\# Deserialization



Converting:



JSON



↓



Java Object



\---



\# Jackson Library



Jackson is the most popular Java library for JSON processing.



Dependency:



```xml

com.fasterxml.jackson.core

```



\---



\# ObjectMapper



Main class provided by Jackson.



Common methods:



\* writeValue()

\* writeValueAsString()

\* readValue()



\---



\## writeValue()



Writes Java object directly to a JSON file.



\---



\## writeValueAsString()



Converts Java object to a JSON String.



Used for:



\* Debugging

\* Logging

\* Sending API responses



\---



\## readValue()



Reads JSON and converts it back into Java objects.



\---



\# Why No-Argument Constructor?



Jackson creates objects using the default constructor during deserialization.



Without it:



Deserialization fails.



\---



\# Why Getters and Setters?



Jackson accesses object properties using getters and setters.



\---



\# Part 3 - Layered Architecture



Goal:



Separate responsibilities.



Architecture:



```text

UI / Controller

&#x20;       ↓

Service

&#x20;       ↓

Repository

&#x20;       ↓

Data Source

```



\---



\## Controller / UI



Responsibilities:



\* Accept user input

\* Display output

\* Call Service layer



No business logic.



\---



\## Service Layer



Responsibilities:



\* Business logic

\* Validation

\* Calculations

\* Calls Repository



\---



\## Repository Layer



Responsibilities:



\* Read data

\* Write data

\* JSON/File interaction



No business logic.



\---



\## Data Source



Storage location.



Examples:



\* JSON

\* Database

\* CSV

\* XML



\---



\# Repository Pattern



Purpose:



Separate data access from business logic.



Benefits:



\* Cleaner architecture

\* Easier maintenance

\* Easier testing



\---



\# Part 4 - JUnit 5



\## What is JUnit?



JUnit is a Java testing framework used to write and execute unit tests.



\---



\# Why Testing?



\* Detect bugs early

\* Prevent regressions

\* Save manual testing time

\* Increase confidence while refactoring



\---



\# Unit Testing



A Unit is the smallest testable piece of code.



Examples:



\* addExpense()

\* getTotalExpense()

\* getHighestExpense()



\---



\# Arrange - Act - Assert



Every test should follow:



```text

Arrange



↓



Act



↓



Assert

```



\---



\# @Test



Marks a method as a test.



\---



\# @BeforeEach



Runs before every test.



Used for:



\* Object creation

\* Test setup



\---



\# @AfterEach



Runs after every test.



Used for:



\* Cleanup



\---



\# @BeforeAll



Runs once before all tests.



\---



\# @AfterAll



Runs once after all tests.



\---



\# Test Lifecycle



```text

@BeforeAll



↓



@BeforeEach



↓



@Test



↓



@AfterEach



(repeats for every test)



↓



@AfterAll

```



\---



\# Assertions



\## assertEquals()



```java

assertEquals(expected, actual);

```



\---



\## assertTrue()



```java

assertTrue(condition);

```



\---



\## assertFalse()



```java

assertFalse(condition);

```



\---



\## assertThrows()



```java

assertThrows(

&#x20;   Exception.class,

&#x20;   () -> {

&#x20;   }

);

```



Used for exception testing.



\---



\# @DisplayName



Provides readable names for tests.



Example:



```java

@DisplayName("Calculate total expense correctly")

```



\---



\# Best Practices



\* One test should verify one behavior.

\* Use meaningful test names.

\* Follow Arrange → Act → Assert.

\* Keep tests independent.

\* Avoid duplicate setup code.

\* Use @BeforeEach for common initialization.

\* Prefer assertThrows() for exception testing.

\* Test both success and failure scenarios.



\---



\# Interview Questions



1\. Difference between FileReader and BufferedReader?

2\. Character Streams vs Byte Streams?

3\. Relative Path vs Absolute Path?

4\. What is Serialization?

5\. What is Deserialization?

6\. Why do we need ObjectMapper?

7\. Why is a no-argument constructor required by Jackson?

8\. Explain Layered Architecture.

9\. Responsibilities of Service and Repository layers?

10\. What is JUnit?

11\. Explain the JUnit Test Lifecycle.

12\. Difference between @BeforeEach and @BeforeAll?

13\. Difference between assertEquals() and assertTrue()?

14\. What is assertThrows() used for?



\---



\# Common Mistakes



\* Forgetting to close resources.

\* Using FileReader instead of BufferedReader for large files.

\* Forgetting append mode in FileWriter.

\* Using readString() for huge files.

\* Missing no-argument constructor during JSON deserialization.

\* Mixing business logic with repository logic.

\* Depending on real files in unit tests.

\* Forgetting Arrange → Act → Assert structure in JUnit tests.



