\# Day 1 — Environment Setup + Java Core Refresh



\## 1. JDK, JRE, JVM



\### JDK



\*\*JDK (Java Development Kit)\*\* is a complete package used to develop Java applications.



It contains:



\* JRE

\* Compiler (`javac`)

\* Java tools such as `java`, `jar`, `javadoc`



\### JRE



\*\*JRE (Java Runtime Environment)\*\* is used to run Java programs.

It contains:



\* JVM

\* required libraries to run Java applications



\### JVM



\*\*JVM (Java Virtual Machine)\*\* is the virtual machine that runs Java bytecode.



\### Flow of execution



```java

.java file → compiled by javac → .class bytecode → executed by JVM

```



\### Why Java is platform independent



Java source code is compiled into \*\*bytecode\*\*, and that bytecode can run on any system that has a JVM.



\*\*Write once, run anywhere\*\* works because of JVM.



\---



\## 2. JAVA\_HOME



`JAVA\_HOME` is an environment variable that stores the path of the installed JDK.



Example:



```text

C:\\Program Files\\Eclipse Adoptium\\jdk-17.0.17+10

```



\### Why it is important



Many tools need it:



\* Maven

\* Gradle

\* IntelliJ

\* Spring Boot applications

\* build pipelines



\---



\## 3. Maven Basics



\### What is Maven?



Maven is a \*\*build automation and dependency management tool\*\*.



\### Why Maven is used



It helps in:



\* managing dependencies

\* standardizing project structure

\* compiling code

\* running tests

\* packaging applications



\### Important file



`pom.xml` is the configuration file of a Maven project.



It stores:



\* project metadata

\* Java version

\* dependencies

\* plugins



\### Standard Maven structure



```text

project/

&#x20;┣ src/

&#x20;┃ ┣ main/java

&#x20;┃ ┗ test/java

&#x20;┣ pom.xml

```



\---



\## 4. Java Program Structure



Example:



```java

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       System.out.println("Hello Java");

&#x20;   }

}

```



\### Important parts



\* `public` → access modifier

\* `class Main` → class declaration

\* `main()` → entry point of Java program



\### Why `main()` is important



The JVM starts execution from:



```java

public static void main(String\[] args)

```



\---



\## 5. Variables



A \*\*variable\*\* is a named memory location used to store data.



Example:



```java

int age = 25;

```



\* `int` → data type

\* `age` → variable name

\* `25` → value



\---



\## 6. Primitive Data Types



Java has 8 primitive data types:



| Type    | Example                |

| ------- | ---------------------- |

| byte    | `byte x = 10;`         |

| short   | `short x = 100;`       |

| int     | `int x = 500;`         |

| long    | `long x = 10000L;`     |

| float   | `float x = 10.5f;`     |

| double  | `double x = 10.5;`     |

| char    | `char ch = 'A';`       |

| boolean | `boolean flag = true;` |



\---



\## 7. Primitive vs Reference Types



\### Primitive Types



Primitive variables store the actual value directly.



Example:



```java

int a = 10;

```



\### Reference Types



Reference variables store the address/reference of an object.



Example:



```java

String name = "Tara";

```



\### Differences



| Primitive               | Reference                           |

| ----------------------- | ----------------------------------- |

| stores actual value     | stores reference                    |

| fixed size              | object-based                        |

| cannot be `null`        | can be `null`                       |

| examples: `int`, `char` | examples: `String`, arrays, objects |



\---



\## 8. Operators



\### Arithmetic Operators



```java

\+  -  \*  /  %

```



Example:



```java

int a = 10;

int b = 3;

System.out.println(a + b); // 13

System.out.println(a / b); // 3

System.out.println(a % b); // 1

```



\### Assignment Operators



```java

=  +=  -=  \*=  /=  %=

```



\### Relational Operators



```java

==  !=  >  <  >=  <=

```



\### Logical Operators



```java

\&\&  ||  !

```



\### Increment / Decrement



```java

++  --

```



\### Important note



If both operands are integers, division gives integer output.



Example:



```java

10 / 3 = 3

```



\---



\## 9. String



\### What is String?



A `String` is a sequence of characters.



Example:



```java

String name = "Tara";

```



\### Why String is a reference type



Because `String` is a class in Java, not a primitive.



\### Common String methods



```java

name.length();

name.toUpperCase();

name.toLowerCase();

name.charAt(0);

name.substring(1);

```



\### String immutability



Strings are immutable, meaning once a String object is created, its value cannot be changed.



Example:



```java

String s = "Hello";

s.concat(" World");

System.out.println(s); // Hello

```



To store the updated value:



```java

s = s.concat(" World");

```



\---



\## 10. Scanner



`Scanner` is used to take input from the user.



Example:



```java

Scanner sc = new Scanner(System.in);

int age = sc.nextInt();

String name = sc.nextLine();

```



\### Common methods



\* `nextInt()`

\* `nextDouble()`

\* `next()`

\* `nextLine()`

\* `nextBoolean()`



\### Difference between `next()` and `nextLine()`



\* `next()` → reads only one word

\* `nextLine()` → reads the full line



\---



\## 11. Conditional Statements



\### if



```java

if (age >= 18) {

&#x20;   System.out.println("Adult");

}

```



\### if-else



```java

if (age >= 18) {

&#x20;   System.out.println("Adult");

} else {

&#x20;   System.out.println("Minor");

}

```



\### if-else-if



```java

if (marks >= 90) {

&#x20;   System.out.println("A");

} else if (marks >= 75) {

&#x20;   System.out.println("B");

} else {

&#x20;   System.out.println("C");

}

```



\---



\## 12. Loops



Loops are used to repeat a block of code.



\### for loop



Used when the number of iterations is known.



```java

for (int i = 1; i <= 5; i++) {

&#x20;   System.out.println(i);

}

```



\### while loop



Used when iterations depend on a condition.



```java

int i = 1;

while (i <= 5) {

&#x20;   System.out.println(i);

&#x20;   i++;

}

```



\### do-while loop



Executes at least once.



```java

int i = 1;

do {

&#x20;   System.out.println(i);

&#x20;   i++;

} while (i <= 5);

```



\---



\## 13. switch Statement



Used when one variable needs to be checked against multiple constant values.



Example:



```java

int day = 3;



switch (day) {

&#x20;   case 1:

&#x20;       System.out.println("Monday");

&#x20;       break;

&#x20;   case 2:

&#x20;       System.out.println("Tuesday");

&#x20;       break;

&#x20;   default:

&#x20;       System.out.println("Invalid day");

}

```



\### Why `break` is important



Without `break`, control falls through into the next case.



\---



\## 14. Debugging Basics



Debugging means running the program in a controlled way to inspect execution flow and variable values.



\### Important debugger actions



\* Breakpoint

\* Step Over

\* Step Into

\* Step Out

\* Resume Program

\* Watch Variables



\### Common debugging examples from Day 1



1\. Division by zero → `ArithmeticException`

2\. Calling method on null → `NullPointerException`

3\. Wrong loop condition / wrong increment-decrement → infinite loop



\---



\## 15. Practice Problems Covered



1\. Prime number

2\. Factorial

3\. Fibonacci series

4\. Reverse number

5\. Palindrome number

6\. Sum of digits

7\. Largest of 3 numbers

8\. Even/odd

9\. Multiplication table

10\. Count digits



\---



\## 16. Important Logic Patterns from Day 1



\### Reverse number pattern



```java

while (num > 0) {

&#x20;   int digit = num % 10;

&#x20;   rev = rev \* 10 + digit;

&#x20;   num = num / 10;

}

```



\### Sum of digits pattern



```java

while (num > 0) {

&#x20;   int digit = num % 10;

&#x20;   sum += digit;

&#x20;   num = num / 10;

}

```



\### Count digits pattern



```java

while (num > 0) {

&#x20;   num = num / 10;

&#x20;   count++;

}

```



\### Prime number pattern



Check divisibility from `2` to `num - 1` (later optimize).



\---



\## 17. Common Mistakes



1\. Using `=` instead of `==`

2\. Forgetting that integer division truncates decimal part

3\. Forgetting `break` in switch

4\. Infinite loops because of wrong increment/decrement

5\. Calling methods on `null`

6\. Scanner issues when mixing `nextInt()` and `nextLine()`

7\. Not handling edge cases like:



&#x20;  \* Fibonacci for `num = 1`

&#x20;  \* Count digits for `0`

&#x20;  \* Largest of three when numbers are equal



\---



\## 18. Interview Questions — Day 1



1\. What is the difference between JDK, JRE, and JVM?

2\. What is bytecode?

3\. Why is Java platform independent?

4\. What is the difference between primitive and reference types?

5\. Why is String immutable?

6\. What is the difference between `next()` and `nextLine()`?

7\. What is the difference between `for`, `while`, and `do-while`?

8\. Why is `main()` static?

9\. What is the purpose of `break` in switch?

10\. What happens when Java code is compiled?



\---



\## 19. Revision Summary



By the end of Day 1, you should be able to:



\* explain JDK, JRE, JVM

\* create and run a Maven Java project

\* write Java programs using variables, operators, conditions, loops, and switch

\* use String methods

\* take input using Scanner

\* solve basic logic problems

\* debug simple Java programs in IntelliJ



