\# Day 3 Notes – Collections, Generics \& Streams



\# 1. Collections Framework



\## What?



The Collections Framework is a set of interfaces and classes provided by Java to store, organize and manipulate groups of objects efficiently.



Instead of storing individual variables, collections allow us to manage multiple objects together.



Example:



\* List of students

\* List of books

\* Map of product IDs to products



\---



\# 2. Why Collections?



Without collections:



```java

String student1;

String student2;

String student3;

```



Not scalable.



Collections solve this problem by allowing dynamic storage.



\---



\# 3. Collection Hierarchy



Main interfaces:



\* List

\* Set

\* Map



Important:



\* List and Set extend the Collection interface.

\* Map is part of the Collections Framework but does not extend Collection.



\---



\# 4. List



\## Characteristics



\* Ordered

\* Allows duplicates

\* Index-based



Example implementations:



\* ArrayList

\* LinkedList



Use when order matters and duplicates are allowed.



\---



\# 5. ArrayList



\## Internal Working



Uses a dynamic array internally.



When capacity becomes full:



\* Creates a larger array

\* Copies existing elements

\* Adds new element



\### Time Complexity



Access by index → O(1)



Insert/Delete in middle → O(n)



Best for:



\* Frequent reading

\* Random access



\---



\# 6. LinkedList



\## Internal Working



Uses a doubly linked list.



Each node stores:



\* Data

\* Previous node reference

\* Next node reference



Useful methods:



\* addFirst()

\* addLast()

\* removeFirst()

\* removeLast()



Best for:



\* Frequent insertion/removal at beginning or end



Random access is slower than ArrayList.



\---



\# 7. Set



Stores unique elements.



Characteristics:



\* No duplicates

\* No indexing



Implementation:



\* HashSet



Best for:



\* Tags

\* Categories

\* Unique email addresses



\---



\# 8. Map



Stores key-value pairs.



Characteristics:



\* Keys are unique

\* Values may repeat



Example:



```java

1 -> Tara

2 -> Arya

3 -> Riya

```



Useful methods:



\* put()

\* get()

\* keySet()

\* values()

\* entrySet()



\---



\# 9. HashMap



Uses hashing internally.



Advantages:



\* Fast lookup

\* Fast insertion

\* Fast deletion



Keys should properly implement:



\* equals()

\* hashCode()



\---



\# 10. TreeMap



Stores key-value pairs in sorted order.



Internally uses a Red-Black Tree.



Use when sorted keys are required.



\---



\# 11. ArrayList vs LinkedList



| Feature                    | ArrayList     | LinkedList         |

| -------------------------- | ------------- | ------------------ |

| Internal structure         | Dynamic array | Doubly linked list |

| Random access              | Fast          | Slow               |

| Insert/Delete at beginning | Slow          | Fast               |

| Memory usage               | Lower         | Higher             |



\---



\# 12. HashMap vs TreeMap



| Feature            | HashMap    | TreeMap         |

| ------------------ | ---------- | --------------- |

| Ordering           | No         | Sorted          |

| Performance        | Faster     | Slightly slower |

| Internal structure | Hash table | Red-Black Tree  |



\---



\# 13. Generics



\## What?



Generics allow classes, interfaces and methods to work safely with different data types.



Example:



```java

List<String>

List<Integer>

```



Benefits:



\* Type safety

\* No explicit casting

\* Cleaner code



\---



\# 14. Generic Class



Example:



```java

class Box<T>

```



`T` is a type parameter.



The same class can work with multiple data types.



\---



\# 15. Generic Method



Example:



```java

public static <T> void printItem(T item)

```



The same method works for different data types.



\---



\# 16. Lambda Expressions



A lambda expression is an anonymous function.



Example:



```java

number -> number \* number

```



Used heavily with Streams.



\---



\# 17. Streams



A Stream processes data from collections without modifying the original collection.



Common operations:



\* filter()

\* map()

\* reduce()

\* sorted()

\* collect()



\---



\# 18. filter()



Purpose:



Keeps only elements matching a condition.



Example:



```java

.filter(number -> number % 2 == 0)

```



Returns:



A Stream containing only matching elements.



\---



\# 19. map()



Purpose:



Transforms each element.



Example:



```java

.map(String::toUpperCase)

```



Can also change the type of elements.



Example:



```java

Integer → String

```



\---



\# 20. reduce()



Purpose:



Combines all elements into a single value.



Example:



```java

.reduce(0, Integer::sum)

```



Useful for:



\* Sum

\* Product

\* Maximum

\* Minimum



\---



\# 21. sorted()



Sorts stream elements.



Example:



```java

.sorted()

```



Custom sorting:



```java

.sorted(Comparator.comparingDouble(Expense::getAmount))

```



\---



\# 22. collect()



Collects stream results into another structure.



Example:



```java

.collect(Collectors.toList())

```



\---



\# 23. groupingBy()



Groups elements by a property.



Example:



```java

Collectors.groupingBy(Expense::getCategory)

```



Returns:



```java

Map<String, List<Expense>>

```



\---



\# 24. Method References



Alternative to simple lambda expressions.



Example:



Instead of:



```java

expense -> expense.getAmount()

```



Use:



```java

Expense::getAmount

```



\---



\# 25. Expense Tracker Architecture



Packages:



\* model

\* service

\* app



Classes:



\* Expense

\* ExpenseTrackerService

\* ExpenseTrackerDemo



\---



\# 26. Common Mistakes



\* Using raw collections

\* Forgetting generic types

\* Using ArrayList everywhere without understanding why

\* Confusing map() with Map

\* Using filter() after unnecessary transformations

\* Forgetting Streams do not modify the original collection

\* Forgetting Map stores key-value pairs



\---



\# 27. Interview Questions



1\. Difference between List and Set.

2\. Difference between HashMap and TreeMap.

3\. Difference between ArrayList and LinkedList.

4\. What problem do Generics solve?

5\. What is type safety?

6\. What is a Stream?

7\. Difference between filter() and map().

8\. What does reduce() do?

9\. What is groupingBy()?

10\. What are method references?



\---



\# Revision Checklist



By the end of Day 3 you should be able to:



\* Explain the Collections Framework.

\* Choose between List, Set and Map.

\* Explain ArrayList vs LinkedList.

\* Explain HashMap vs TreeMap.

\* Create generic classes.

\* Create generic methods.

\* Write Stream pipelines.

\* Use filter(), map(), reduce(), sorted() and groupingBy().

\* Build an application using Collections and Streams.



