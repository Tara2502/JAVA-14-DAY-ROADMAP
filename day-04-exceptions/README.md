\# Day 4 – Exception Handling, Logging \& Production-Style Error Handling



\## Overview



This project focuses on learning Java exception handling from the basics to production-level practices. The existing Expense Tracker application was upgraded by adding custom exceptions, validation, clean error handling, and logging using SLF4J and Logback.



\---



\## Topics Covered



\### Exception Handling



\* Exception vs Error

\* Checked vs Unchecked Exceptions

\* Exception Hierarchy

\* try, catch and finally

\* Multiple catch blocks

\* Multi-catch

\* throw

\* throws

\* Exception Propagation

\* Custom Exceptions



\### Clean Error Handling



\* Input Validation

\* Meaningful Error Messages

\* Guard Clauses

\* Domain Exceptions vs Technical Exceptions

\* Best Practices for Exception Handling



\### Logging



\* Introduction to Logging

\* Why not use `System.out.println()`

\* Log Levels (TRACE, DEBUG, INFO, WARN, ERROR)

\* SLF4J

\* Logback

\* Logger Creation

\* Placeholder Syntax (`{}`)



\---



\## Practice Programs



\* ArithmeticException Demo

\* NullPointerException Demo

\* ArrayIndexOutOfBoundsException Demo

\* try-catch Examples

\* finally Examples

\* Multiple Catch Demo

\* Multi-Catch Demo

\* throw Examples

\* throws Examples

\* Custom Exception Examples

\* Exception Propagation Demo



\---



\## Expense Tracker Enhancements



The Expense Tracker project was improved by implementing:



\* Custom domain exceptions

\* Input validation

\* Meaningful exception messages

\* SLF4J logging

\* Logback integration

\* Clean service layer

\* Better exception handling

\* Improved code readability



\---



\## Custom Exceptions Created



\* ExpenseValidationException

\* ExpenseNotFoundException

\* InvalidCategoryException



\---



\## Project Structure



```text

src

├── main

│   └── java

│       ├── app

│       ├── model

│       ├── service

│       ├── exceptions

│       └── practice

```



\---



\## Key Learnings



\* Exceptions help separate business logic from error handling.

\* Checked exceptions must be handled or declared.

\* Unchecked exceptions usually indicate programming or business rule errors.

\* Custom exceptions improve readability and maintainability.

\* Exception propagation allows higher layers to handle errors.

\* Logging is preferred over `System.out.println()` in production applications.

\* Validation should be performed as early as possible.



\---



\## Technologies Used



\* Java 17

\* Maven

\* IntelliJ IDEA

\* SLF4J

\* Logback

\* Java Stream API

\* Collections Framework



\---



\## Outcome



By the end of Day 4, the Expense Tracker evolved from a basic in-memory application into a cleaner, production-oriented application featuring structured exception handling, logging, and improved validation practices.



\---



\## Next Step



Day 5 will focus on:



\* File I/O

\* JSON Serialization \& Deserialization (Jackson)

\* Layered Architecture

\* JUnit 5 Testing

\* Persisting Expense Tracker data to a JSON file



