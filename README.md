# Java-OOP_RoadMapByJG : Chapter 2 What is Class in Java

## Declaring Classes

```java
class MyClass {
    // field, constructor, and 
    // method declarations
}
```

```java
class MyClass extends MySuperClass implements YourInterface {
    // field, constructor, and
    // method declarations
}
```

In general, class declarations can include these components, in order:
1. Modifiers such as <b>public, private, protected, default</b>.
2. The class name, with the initial letter capitalized by convention.
3. The name of the class's parent (superclass), if any, preceded by the keyword <b>extends</b>. A class can only extend (subclass) one <b>parent</b>.
4. A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword <b>implements</b>. A class can implement more than one interface.
5. The class body, surrounded by braces, {}.

## Declaring Member Variables
There are several kinds of variables:
* Member variables in a class — these are called <b>fields</b>.
* Variables in a method or block of code — these are called <b>local variables</b>.
* Variables in method declarations — these are called <b>parameters</b>.

The Bicycle class uses the following lines of code to define its fields:
```java
public class Bicycle {
        
    private int cadence;
    private int gear;
    private int speed;
}
```

Field declarations are composed of three components, in order:
* Zero or more modifiers, such as <b>public or private</b>.
* The field's type.
* The field's name.

## Access Modifiers

### 1. Private Access Modifier
A private class member cannot be accessed from outside the class; only members of the same class can access these private members.

### 2. Default Access Modifier (no access modifier specified)
When we do not mention any access modifier, it is called default access modifier. The scope of this modifier is limited to the package only. This means that if we have a class with the default access modifier in a package, only those classes that are in this package can access this class. No other class outside this package can access this class. Similarly, if we have a default method or data member in a class, it would not be visible in the class of another package.

### 3. Protected Access Modifier
If a class or its members are declared as protected are only accessible by the classes of the same package and the subclasses present in any package. You can also say that the protected access modifier is similar to default access modifier with one exception that it has visibility in subclasses.

### 4. Public Access Modifier
If a class or its members are declared as public, they can be accessed from any other class regardless of the package boundary. It is comparable to a public place in the real world, such as a company cafeteria that all employees can use irrespective of their department.

## Defining Methods
```java
public double calculateAnswer(double wingSpan, int numberOfEngines, double length, double grossTons) {
    //do the calculation here
}
```

More generally, method declarations have six components, in order:
* Modifiers—such as public, private, protected, default.
* The return type—the data type of the value returned by the method, or void if the method does not return a value.
* The method name—the rules for field names apply to method names as well, but the convention is a little different.
* The parameter list in parenthesis—a comma-delimited list of input parameters, preceded by their data types, enclosed by parentheses, (). If there are no parameters, you must use empty parentheses.
* An exception list—to be discussed later.
* The method body, enclosed between braces—the method's code, including the declaration of local variables, goes here.

## Constructors

### Rules for creating Java constructor
There are two rules defined for the constructor.
* Constructor name must be the same as its class name
* A Constructor must have no explicit return type
* A Java constructor cannot be abstract, static, final, and synchronized

```java
package net.javaguides.corejava.oops;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Student {
    private String name = "Ramesh";
    private String college = "ABC";
    
    // default constructor
    public Student() {
        super();
    }

    // parameterized constructor
    public Student(String name, String college) {
        super();
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
}
```

## More Class Examples in Java
```java
public class Circle {
    private int xPos;
    private int yPos;
    private int radius;

    // three overloaded constructors for Circle
    public Circle(int x, int y, int r) {
        xPos = x;
        yPos = y;
        radius = r;
    }

    public Circle(int x, int y) {
        xPos = x;
        yPos = y;
        radius = 10; // default radius
    }

    public Circle() {
        xPos = 20; // assume some default values for xPos and yPos
        yPos = 20;
        radius = 10; // default radius
    }

    public String toString() {
        return "center = (" + xPos + "," + yPos + ") and radius = " + radius;
    }

    public static void main(String[] s) {
        System.out.println(new Circle());
        System.out.println(new Circle(50, 100));
        System.out.println(new Circle(25, 50, 5));
    }
}

// Output : 
// center = (20,20) and radius = 10
// center = (50,100) and radius = 10
// center = (25,50) and radius = 5
```

---