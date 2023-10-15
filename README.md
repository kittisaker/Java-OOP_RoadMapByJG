# Java-OOP_RoadMapByJG : Chapter 6 Java Abstract Class

## Abstract Class, Abstract Method
```java
// Abstract class
abstract class Shape {
    // Abstract method (no method body)
    public abstract double calculateArea();

    // Concrete method
    public void display() {
        System.out.println("This is a shape.");
    }
}
```

<details>
<summary>Full example</summary>

```java
// Abstract class
abstract class Shape {
    // Abstract method (no method body)
    public abstract double calculateArea();

    // Concrete method
    public void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass
class Rectangle extends Shape {
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

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        circle.display();
        System.out.println("Circle Area: " + circle.calculateArea());

        rectangle.display();
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}
```

</details>

## If a class includes abstract methods, then the class itself must be declared abstract
```java
public abstract class AbstractClassExample {
   // declare fields
   // declare nonabstract methods
   abstract void abstractMethod();
}
```
## When an abstract class is subclassed
In Java, you can create a hierarchy of abstract classes where an abstract class can be a subclass of another abstract class or a non-abstract class. Let's look at an example where an abstract class is a subclass of another abstract class:
```java
// Abstract class
abstract class Shape {
    // Abstract method
    public abstract double calculateArea();

    // Concrete method
    public void display() {
        System.out.println("This is a shape.");
    }
}

// Abstract subclass
abstract class TwoDimensionalShape extends Shape {
    // New abstract method in the subclass
    @Override
    public abstract double calculatePerimeter();
}
```

<details>
<summary>Full example</summary>

```java
// Abstract class
abstract class Shape {
    // Abstract method
    public abstract double calculateArea();

    // Concrete method
    public void display() {
        System.out.println("This is a shape.");
    }
}

// Abstract subclass
abstract class TwoDimensionalShape extends Shape {
    // New abstract method in the subclass
    @Override
    public abstract double calculatePerimeter();
}

// Concrete subclass
class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);

        circle.display();
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
    }
}
```

</details>

## When an Abstract Class Implements an Interface

```java
// Interface
interface Drawable {
    void draw();
}

// Abstract class implementing the interface
abstract class Shape implements Drawable {
    // Concrete method from the interface
    public void draw() {
        System.out.println("Drawing a shape.");
    }

    // Abstract method in the abstract class
    public abstract double calculateArea();
}

// Concrete subclass
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);

        circle.draw();
        System.out.println("Circle Area: " + circle.calculateArea());
    }
}
```

---