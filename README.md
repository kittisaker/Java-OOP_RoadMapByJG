# Java-OOP_RoadMapByJG : Chapter 7 Abstraction in Java with Example

## Implementation with Example
Abstraction is a fundamental concept in Java that involves simplifying complex systems by modeling classes based on their essential characteristics and behaviors. It focuses on what an object does rather than how it does it. Abstraction allows you to create a simplified model of an object, which is helpful for managing complexity and designing a high-level structure of your software. In Java, abstraction is achieved through abstract classes and interfaces.

```java
// Abstract class
abstract class Shape {
    // Abstract method (no method body)
    public abstract void draw();

    // Concrete method (with a method body)
    public void display() {
        System.out.println("This is a shape.");
    }
}

// Interface
interface Resizable {
    void resize(int percentage);
}

// Concrete class implementing the abstract class and interface
class Circle extends Shape implements Resizable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }

    @Override
    public void resize(int percentage) {
        radius = radius * (1.0 + (percentage / 100.0));
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);

        circle.display(); // Calls the concrete method from the abstract class
        circle.draw();    // Calls the abstract method from the abstract class
        System.out.println("Original Circle Radius: " + circle.radius);

        circle.resize(20);  // Calls the method from the interface to resize the circle
        System.out.println("Resized Circle Radius: " + circle.radius);
    }
}
```

---