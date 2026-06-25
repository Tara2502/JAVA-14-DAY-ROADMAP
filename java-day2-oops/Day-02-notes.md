Day 2 — OOP the Production Way + Object Design Basics

1\. Class and Object

Class

A class is a blueprint or template for creating objects.

It defines:

state → fields/variables

behavior → methods

Example:

public class Book {

&#x20;   String title;

&#x20;   String author;

&#x20;   double price;

}

Object

An object is an instance of a class created in memory.

Example:

Book book1 = new Book();

Book → class type

book1 → reference variable

new Book() → creates object in memory

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

2\. Constructor

A constructor is a special block used to initialize objects.

Rules

Constructor name must be same as class name

It has no return type

It runs automatically when an object is created

Example

public class Book {

&#x20;   private String title;

&#x20;   private String author;



&#x20;   public Book(String title, String author) {

&#x20;       this.title = title;

&#x20;       this.author = author;

&#x20;   }

}

Why constructor is useful

Without constructor, we create an object first and then assign values manually.

With constructor, object creation becomes cleaner and safer.

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

3\. this Keyword

this refers to the current object.

Example:

public Book(String title, String author) {

&#x20;   this.title = title;

&#x20;   this.author = author;

}

Why it is needed

If parameter names and instance variable names are same, this helps distinguish them.

this.title → object field

title → constructor parameter

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

4\. Encapsulation

Encapsulation means hiding internal data and controlling access to it.

How to achieve encapsulation

Make fields private

Provide controlled access using getters/setters

Example:

private double price;



public void setPrice(double price) {

&#x20;   if (price < 0) {

&#x20;       throw new IllegalArgumentException("Price cannot be negative");

&#x20;   }

&#x20;   this.price = price;

}

Why encapsulation matters

It prevents invalid object state such as:

negative price

blank title

invalid IDs

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

5\. Getters and Setters

Getter

Used to read private field value.

public String getTitle() {

&#x20;   return title;

}

Setter

Used to update field value in a controlled way.

public void setTitle(String title) {

&#x20;   this.title = title;

}

Why getters/setters are useful

They allow validation and controlled access without exposing fields directly.

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

6\. Validation Inside Objects

A good object should protect its own state.

Examples of validation:

id should be positive

name should not be blank

price should not be negative

marks should be between 0 and 100

Example:

if (name == null || name.isBlank()) {

&#x20;   throw new IllegalArgumentException("Name cannot be blank");

}

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

7\. Inheritance

Inheritance allows one class to acquire properties and behavior of another class.

Syntax

class Member extends Person {

}

Example

public class Person {

&#x20;   protected int id;

&#x20;   protected String name;

}

public class Member extends Person {

&#x20;   private String membershipType;

}

Why use inheritance

It is useful when there is an is-a relationship.

Example:

Member is a Person

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

8\. super()

super() is used to call the parent class constructor.

Example:

public Member(int id, String name, String membershipType) {

&#x20;   super(id, name);

&#x20;   this.membershipType = membershipType;

}

Why use it

It initializes the parent part of the child object.

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

9\. Composition vs Inheritance

Composition

Composition means one class contains another object.

Example:

public class Loan {

&#x20;   private Book book;

&#x20;   private Member member;

}

Use composition when relationship is has-a

Loan has a Book

Loan has a Member

Car has an Engine

Use inheritance when relationship is is-a

Member is a Person

Dog is an Animal

Why composition is often preferred

It gives more flexibility and avoids tight coupling.

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

10\. Interface

An interface defines a contract of behavior.

Example:

public interface Notifiable {

&#x20;   void sendNotification();

}

A class implementing it must provide the method body.

public class Member extends Person implements Notifiable {

&#x20;   @Override

&#x20;   public void sendNotification() {

&#x20;       System.out.println("Notification sent");

&#x20;   }

}

Why interfaces matter

They support abstraction and polymorphism and are heavily used in real-world Java and Spring applications.

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

11\. Polymorphism

Polymorphism means one reference can represent multiple forms.

Example:

Notifiable n = new Member(1, "Tara", "Gold");

n.sendNotification();

The reference type is Notifiable, but the actual object is Member.

Why it is useful

It makes code flexible and easier to extend.

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

12\. static

static means a member belongs to the class itself, not to each object.

Example:

private static int totalBooksCreated;

Use cases

­	counters

­	utility methods

­	shared configuration values

­	constants (often with final)

Example

public static int getTotalBooksCreated() {

&#x20;   return totalBooksCreated;

}

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

13\. final

final variable

­	Cannot be reassigned after initialization.

final int MAX = 10;

final method

­	Cannot be overridden by child class.

final class

­	Cannot be inherited.

Example:

public final class BankAccountInfo {

}

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

14\. Immutability

An immutable object is one whose state cannot change after creation.

Rules for immutable class

­	make class final

­	make fields private final

­	initialize all fields through constructor

­	do not provide setters

Example:

public final class BankAccountInfo {

&#x20;   private final String accountHolderName;

&#x20;   private final long accountNumber;

&#x20;   private final String branchName;

}

Why immutability is useful

­	safer design

­	no accidental modification

­	easier debugging

­	better for thread safety

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

15\. Packages

A package is used to organize related classes.

Examples:

package Library.model;

package Library.service;

package Practice;

Why packages matter

­	better code organization

­	avoids naming conflicts

­	creates clean project structure

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

16\. Access Modifiers

Modifier	Same Class	Same Package	Subclass	Everywhere

private	Yes	No	No	No

default	Yes	Yes	No	No

protected	Yes	Yes	Yes	No

public	Yes	Yes	Yes	Yes

Meaning

private → only inside same class

default → only inside same package

protected → same package + subclasses

public → accessible everywhere

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

17\. Day 2 Mini-Build — Library Domain Model

Classes created

­	Person

­	Member

­	Book

­	Loan

­	Notifiable

­	LibraryDemo

OOP concepts covered through mini-build

­	class and object

­	constructor

­	this

­	encapsulation

­	validation

­	inheritance

­	super()

­	composition

­	interface

­	polymorphism-ready design

­	static counter

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

18\. Day 2 Practice Classes

Practice classes created

­	Student

­	Employee

­	Manager

­	Printable

­	Report

­	BankAccountInfo

­	PracticeDemo

What each practice class taught

­	Student → constructor validation + getters

­	Employee + Manager → inheritance + constructor chaining

­	Printable + Report → interface + implementation

­	BankAccountInfo → immutable class design

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

19\. Common Mistakes in OOP

­	Making fields public

­	Skipping validation in constructors/setters

­	Using inheritance where composition should be used

­	Adding setters for everything without thinking about immutability

­	Confusing interface with class

­	Forgetting super() in child constructor

­	Using static incorrectly for instance-specific data

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

20\. Interview Questions — Day 2

1\.	What is a class and what is an object?

2\.	What is a constructor and why is it used?

3\.	What is the purpose of this?

4\.	What is encapsulation?

5\.	Why do we use getters and setters?

6\.	What is inheritance?

7\.	What is the role of super()?

8\.	What is the difference between inheritance and composition?

9\.	What is an interface?

10\.	What is polymorphism?

11\.	What is the difference between static and non-static members?

12\.	What does final mean for variable, method, and class?

13\.	What is an immutable class and how do you create one?

14\.	What is the purpose of packages and access modifiers?

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

21\. Revision Summary

By the end of Day 2, you should be able to:

­	create classes and objects

­	use constructors and this

­	apply encapsulation properly

­	write getters/setters with validation

­	use inheritance and super()

­	decide between inheritance and composition

­	create and implement interfaces

­	understand polymorphism conceptually

­	use static and final

­	create a basic immutable class

­	organize code into packages





