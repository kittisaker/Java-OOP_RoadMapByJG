# Java-OOP_RoadMapByJG : Chapter 1 What Is an Object in Java

## How to Declare, Create and Initialize an Object in Java

```java
public class Student {
    private String name;
    private String college;
    
    public Student(String name, String college) {
        this.name = name;
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
    
    public static void main(String[] args) {
        Student student1 = new Student("Ramesh", "BVB");
        Student student2 = new Student("Prakash", "GEC");
        Student student3 = new Student("Pramod", "IIT");
    }
}
```

Each of these statements has three parts (discussed in detail below):
* <b>Declaration:</b> The code <b>Student student;</b> declarations that associate a variable name with an object type.
* <b>Instantiation:</b> The <b>new</b> keyword is a Java operator that creates the object.
* <b>Initialization:</b> The <b>new</b> operator is followed by a call to a constructor, which initializes the new object.

## Different Ways to Create an Object in Java?

### 1. Using a new keyword
This is the most popular way of creating an object in Java using a new keyword. This approach every Java Developer knows.
```java
package kope;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ramesh", "BVB");
        Student student2 = new Student("Prakash", "GEC");
        Student student3 = new Student("Pramod", "IIT");
    }
}
```

### 2. Using newInstance() method of Class class
The newInstance() method from the Class class was deprecated in Java 9 and was eventually removed in Java 11.

### 3. Using newInstance() method of Constructor class 
The newInstance() method from the Class class was deprecated in Java 9 and was eventually removed in Java 11.

### 4. Using Object Deserialization
In this approach, we will be using Serializable interface in Java which is a marker interface(interface with no fields or methods within it)

### 5. Using Object Cloning – clone() method
The clone() method is used to create a copy of an existing object, in order to the clone() method the corresponding class should have implemented a Cloneable interface which is again a Marker Interface. 

## java.lang.Object Class in Java

In Java, java.lang.Object is the root class of the Java class hierarchy. Every class in Java implicitly or explicitly extends the Object class. This means that Object is the ultimate superclass of all classes in Java. It provides a common set of methods and behaviors that are inherited by all objects, making it a fundamental part of the Java language.

Here are some of the key methods and behaviors provided by the Object class:

* equals(Object obj): This method is used to compare the current object with another object for equality. The default implementation in the Object class checks for reference equality. Subclasses often override this method to provide custom equality checks.

* hashCode(): This method returns a hash code value for the object. It is used by data structures like hash tables.

* toString(): This method returns a string representation of the object. The default implementation in Object returns the class name followed by an "@" sign and the hash code.

* getClass(): This method returns the runtime class of the object. It is often used to obtain information about the class of an object.

* notify(), notifyAll(), and wait(): These methods are used for inter-thread communication and synchronization. They allow one or more threads to communicate and coordinate their activities.

* finalize(): This method is called by the garbage collector before an object is reclaimed. It can be overridden to perform cleanup tasks.

* clone(): This method is used to create a copy of the object. It allows objects to be cloned if they implement the Cloneable interface.

* wait(long timeout), wait(long timeout, int nanos), and wait(): These methods are part of the inter-thread communication mechanism and are used to make a thread wait for a condition to be met.

While the Object class provides default implementations for these methods, they are often overridden in subclasses to customize their behavior.

Because every class in Java inherits from Object, it means that you can use the methods defined in the Object class with any object. For example, you can call toString() or equals() on any Java object.

Here's an example of using some of these methods:

```java
public class ObjectDemo {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println(obj1.equals(obj2));  // false
        System.out.println(obj1.hashCode());    // a unique hash code
        System.out.println(obj1.toString());    // returns the class name and hash code
    }
}
```

---



