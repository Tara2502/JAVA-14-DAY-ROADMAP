\# 📂 Day 05 - File I/O \& JSON in Java



\## 📖 Overview



This module focuses on Java File Handling, the NIO (`java.nio.file`) API, Character Streams, Buffered Streams, JSON processing using Jackson, and applying these concepts in practical applications.



The goal of this module was to understand how Java applications persist data outside memory and how JSON is used as a lightweight data exchange format.



\---



\# 🚀 Topics Covered



\## File I/O



\* File Input \& Output

\* Character Streams

\* Byte Streams

\* Path API

\* Files API

\* Relative vs Absolute Path

\* FileReader

\* FileWriter

\* BufferedReader

\* BufferedWriter

\* Try-With-Resources



\---



\## JSON



\* Introduction to JSON

\* Serialization

\* Deserialization

\* Jackson Library

\* ObjectMapper

\* writeValue()

\* writeValueAsString()

\* readValue()



\---



\## Practical Programs



\### File I/O



\* PathDemo

\* FilesDemo

\* CreateFileDemo

\* ReadStringDemo

\* ReadAllLinesDemo

\* FileReaderDemo

\* BufferedReaderDemo

\* FileWriterDemo

\* BufferedWriterDemo

\* StudentNotesManager



\---



\### JSON



\* SerializationDemo

\* WriteValueAsStringDemo

\* DeserializationDemo



\---



\# 📁 Project Structure



```text

day-05-file-io-json

│

├── src

│   └── main

│       └── java

│           ├── fileio

│           │   ├── PathDemo

│           │   ├── FilesDemo

│           │   ├── CreateFileDemo

│           │   ├── ReadStringDemo

│           │   ├── ReadAllLinesDemo

│           │   ├── FileReaderDemo

│           │   ├── BufferedReaderDemo

│           │   ├── FileWriterDemo

│           │   ├── BufferedWriterDemo

│           │   └── StudentNotesManager

│           │

│           └── json

│               ├── SerializationDemo

│               ├── WriteValueAsStringDemo

│               ├── DeserializationDemo

│               └── model

│                   └── Student

│

├── notes.txt

├── pom.xml

└── README.md

```



\---



\# 🛠 Technologies Used



\* Java 21

\* Maven

\* Jackson Databind

\* IntelliJ IDEA

\* Git \& GitHub



\---



\# 📚 Key Concepts Learned



\* Reading and writing files using Java

\* Using the modern NIO API (`Path` and `Files`)

\* Difference between Character Streams and Byte Streams

\* Buffered I/O for better performance

\* Automatic resource management using Try-With-Resources

\* JSON serialization and deserialization using Jackson

\* Converting Java Objects to JSON and vice versa



\---



\# 🎯 Learning Outcomes



After completing this module, I can:



\* Read and write text files in Java.

\* Create and manage files and directories.

\* Work with `Path` and `Files` APIs.

\* Understand Character Streams and Byte Streams.

\* Improve I/O performance using Buffered Streams.

\* Handle resources safely using Try-With-Resources.

\* Convert Java Objects into JSON.

\* Convert JSON into Java Objects.

\* Use Jackson's `ObjectMapper` for JSON processing.



\---



\# 📌 Next Step



The next module focuses on enhancing the Expense Tracker project with testing using \*\*JUnit 5\*\*, followed later in the roadmap by interface-based design, dependency injection, and Mockito for professional unit testing.



