\# Day 4 Notes – Exceptions, Error Handling \& Logging



\## 1. What is an Exception



An exception is an event that occurs during the execution of a program and interrupts the normal flow of execution.



\### Why do we need Exceptions



&#x20;To prevent unexpected program crashes.

&#x20;To handle errors gracefully.

&#x20;To separate normal program logic from error-handling logic.



\---



\# 2. Error vs Exception



\## Error



&#x20;Represents serious problems that applications generally should not handle.

&#x20;Caused by the JVM or system.

&#x20;Examples



&#x20;  OutOfMemoryError

&#x20;  StackOverflowError



\## Exception



&#x20;Represents problems that an application can handle.

&#x20;Examples



&#x20;  ArithmeticException

&#x20;  IOException

&#x20;  NullPointerException



\---



\# 3. Checked vs Unchecked Exceptions



\## Checked Exceptions



&#x20;Checked at compile time.

&#x20;Must be handled using try-catch or declared using throws.

&#x20;Examples



&#x20;  IOException

&#x20;  SQLException



\## Unchecked Exceptions



&#x20;Checked at runtime.

&#x20;Handling is optional.

&#x20;Usually caused by programming mistakes.

&#x20;Examples



&#x20;  ArithmeticException

&#x20;  NullPointerException

&#x20;  IllegalArgumentException



\---



\# 4. Exception Hierarchy



```

Throwable

├── Error

└── Exception

&#x20;     ├── RuntimeException

&#x20;     │      ├── ArithmeticException

&#x20;     │      ├── NullPointerException

&#x20;     │      └── IllegalArgumentException

&#x20;     └── IOException

```



\---



\# 5. try-catch-finally



\## try



Contains code that may throw an exception.



\## catch



Handles the exception.



\## finally



Executes whether an exception occurs or not (except in rare cases like JVM termination using System.exit()).



\---



\# 6. Multiple Catch



A single try block can have multiple catch blocks.



Always catch exceptions from most specific to most general.



Correct



```

ArithmeticException

NullPointerException

Exception

```



Incorrect



```

Exception

ArithmeticException

```



\---



\# 7. Multi-Catch



Introduced in Java 7.



Syntax



```

catch (ArithmeticException  NullPointerException e)

```



Use when multiple exceptions require the same handling.



Do not combine parent-child exception types.



\---



\# 8. throw



Used to explicitly throw an exception.



Example



```

throw new IllegalArgumentException(Age cannot be negative.);

```



\---



\# 9. throws



Used in a method declaration to indicate that a method may throw an exception.



Example



```

public void readFile() throws IOException

```



\---



\# 10. Difference between throw and throws



&#x20;throw                         throws                                        

&#x20;----------------------------  --------------------------------------------- 

&#x20;Used inside a method          Used in method declaration                    

&#x20;Actually throws an exception  Declares that a method may throw an exception 

&#x20;Creates an exception object   Does not create an exception                  



\---



\# 11. Custom Exceptions



Custom exceptions represent business-specific errors.



Examples



&#x20;InvalidMarksException

&#x20;InvalidSalaryException

&#x20;ExpenseValidationException

&#x20;ExpenseNotFoundException

&#x20;InvalidCategoryException



Custom exceptions generally extend RuntimeException for business validation.



\---



\# 12. Exception Propagation



If a method does not handle an exception, it propagates to the calling method.



Example



```

main()

&#x20;   ↓

methodA()

&#x20;   ↓

methodB()

&#x20;   ↓

methodC()

```



If methodC throws an exception



```

methodC

↓

methodB

↓

methodA

↓

main

↓

JVM

```



\---



\# 13. Validation



Validation means checking input before processing it.



Examples



&#x20;Marks between 0–100

&#x20;Salary  0

&#x20;Name not blank

&#x20;Expense not null



Validate early using guard clauses.



\---



\# 14. Error Messages



Good error messages should clearly explain



&#x20;What went wrong.

&#x20;Which rule was violated.



Example



Good



```

Marks must be between 0 and 100.

```



Bad



```

Error

```



\---



\# 15. Domain vs Technical Exceptions



\## Domain Exceptions



Represent business rule violations.



Examples



&#x20;ExpenseValidationException

&#x20;InvalidCategoryException

&#x20;ExpenseNotFoundException



\## Technical Exceptions



Represent infrastructure or system failures.



Examples



&#x20;IOException

&#x20;SQLException

&#x20;SocketTimeoutException



\---



\# 16. Clean Exception Handling



&#x20;Catch exceptions only where you can handle them.

&#x20;Let exceptions propagate when appropriate.

&#x20;Avoid catching Exception everywhere.

&#x20;Use specific exceptions.

&#x20;Never swallow exceptions.

&#x20;Keep try blocks small.

&#x20;Prefer guard clauses.

&#x20;Do not use exceptions for normal program flow.



\---



\# 17. Logging



Logging records important events during program execution.



It is used for



&#x20;Debugging

&#x20;Monitoring

&#x20;Auditing

&#x20;Troubleshooting



\---



\# 18. Why not System.out.println()



System.out.println()



&#x20;Temporary

&#x20;Console only

&#x20;No log levels

&#x20;Difficult to monitor in production



Logging



&#x20;Console

&#x20;Files

&#x20;Cloud logging systems

&#x20;Searchable

&#x20;Filterable

&#x20;Timestamped



\---



\# 19. Log Levels



TRACE



&#x20;Very detailed execution information.



DEBUG



&#x20;Developer debugging information.



INFO



&#x20;Normal application events.



WARN



&#x20;Recoverable problems.



ERROR



&#x20;Serious failures.



Severity order



```

TRACE → DEBUG → INFO → WARN → ERROR

```



\---



\# 20. SLF4J



SLF4J (Simple Logging Facade for Java) is a logging API.



It provides a common interface for logging frameworks.



\---



\# 21. Logback



Logback is the logging implementation used by Spring Boot by default.



Responsibilities



&#x20;Print logs

&#x20;Write log files

&#x20;Rotate log files

&#x20;Format log messages



\---



\# 22. Creating a Logger



```

private static final Logger logger =

&#x20;       LoggerFactory.getLogger(ClassName.class);

```



\---



\# 23. Logging Methods



```

logger.trace();

logger.debug();

logger.info();

logger.warn();

logger.error();

```



\---



\# 24. Placeholder Syntax



Preferred



```

logger.info(Expense added {}, expense.getTitle());

```



Avoid



```

logger.info(Expense added  + expense.getTitle());

```



\---



\# 25. Expense Tracker Improvements



Implemented



&#x20;Custom exceptions

&#x20;Input validation

&#x20;Meaningful error messages

&#x20;SLF4J logging

&#x20;Domain-specific exceptions

&#x20;Exception propagation

&#x20;Clean service layer

&#x20;Improved error handling



\---



\# Key Takeaways



&#x20;Exceptions separate normal logic from error handling.

&#x20;Handle exceptions at the appropriate layer.

&#x20;Use custom exceptions for business rules.

&#x20;Use logging instead of System.out.println() in services.

&#x20;Validate inputs early.

&#x20;Prefer specific exceptions.

&#x20;Write meaningful error messages.

&#x20;Let exceptions propagate when you cannot handle them.



