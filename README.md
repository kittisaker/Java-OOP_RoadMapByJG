# Java-OOP_RoadMapByJG : Chapter 13 

## Overview
- It represents a relationship between two or more objects where all objects have their own life cycle and there is no owner. The name of an association specifies the nature of the relationship between objects.

## Intent/Definition
Association is a relation between two separate classes which establishes through their Objects. Association can be one-to-one, one-to-many, many-to-one, many-to-many.

In Object-Oriented programming, an Object communicates to other Objects to use functionality and services provided by that object.

There are two forms of association
- Composition
- Aggregation

## Implementation
```java
public class Teacher {
   private String name;
   private List<Student> students;
   // getter and setter methods 
}

public class Student {
   private String name;
   private List<Teacher> teachers;
   // getter and setter methods 
}
```

---