# Java-OOP_RoadMapByJG : Chapter 10 Polymorphism in Java with Example

## Implementation with Examples
Polymorphism is one of the four fundamental principles of object-oriented programming, along with encapsulation, inheritance, and abstraction. In Java, polymorphism allows you to write code that can work with objects of different classes in a consistent way. Polymorphism can be achieved through method overriding and interfaces.

Let's say we have a simple scenario involving different shapes, such as circles and rectangles. We want to calculate and print the area of each shape using polymorphism.

1. Create a base class called Shape:
```java
public class Shape {
    public double calculateArea() {
        return 0.0;
    }
}
```

2. Create two subclasses, Circle and Rectangle, that inherit from the Shape class:
```java
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
```

```java
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
```

3. Create a class to demonstrate polymorphism:
```java
public class PolymorphismDemo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.0);
        shapes[1] = new Rectangle(4.0, 5.0);
        shapes[2] = new Circle(2.5);

        for (Shape shape : shapes) {
            System.out.println("Area of the shape: " + shape.calculateArea());
        }
    }
}
```

```shell
Area of the shape: 28.274333882308138
Area of the shape: 20.0
Area of the shape: 19.634954084936208
```

## Types of Polymorphism in Java

### Compile-time Polymorphism
Compile-time polymorphism in Java is also known as method overloading. It occurs when multiple methods in the same class have the same name but different parameter lists. The appropriate method to call is determined at compile time based on the number and types of arguments passed to the method. This is also known as static polymorphism or early binding.
```java
public class MathOperations {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println("Sum of two integers: " + math.add(5, 10));
        System.out.println("Sum of three integers: " + math.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + math.add(3.5, 2.5));
    }
}
```

```shell
Sum of two integers: 15
Sum of three integers: 30
Sum of two doubles: 6.0
```

### Runtime Polymorphism
Runtime polymorphism is a process in which a call to an overridden method is resolved at runtime rather than compile-time.

In this process, an overridden method is called through the reference variable of a superclass. The determination of the method to be called is based on the object being referred to by the reference variable.

#### Upcasting
When the reference variable of Parent class refers to the object of Child class, it is known as upcasting.
```java
class A {}
class B extends A {}
class Demo {
    public static void main(String[] args) {
        A a = new B(); //upcasting  
    }
}
```

#### Java Runtime Polymorphism with Data Member 

The method is overridden by not applicable data members, so runtime polymorphism can't be achieved by data members.

In the example given below, both the classes have a data member speedlimit, we are accessing the data member by the reference variable of Parent class which refers to the subclass object. Since we are accessing the data member which is not overridden, hence it will access the data member of the Parent class always.

```java
class Bike {
    int speedlimit = 90;
}
class Honda extends Bike {
    int speedlimit = 150;

    public static void main(String args[]) {
        Bike obj = new Honda();
        System.out.println(obj.speedlimit); //90  
    }
}
```

Let's try the below scenario: Here the BabyDog is not overriding the eat() method, so eat() method of Dog class is invoked. Note that if we are not using @Override annotation in this example.
```java
class Animal {
    void eat() {
        System.out.println("animal is eating...");
    }
}
class Dog extends Animal {
    void eat() {
        System.out.println("dog is eating...");
    }
}
class BabyDog1 extends Dog {
    public static void main(String args[]) {
        Animal a = new BabyDog1();
        a.eat();
    }
}
```

---