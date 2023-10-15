# Java-OOP_RoadMapByJG : Chapter 9 Inheritance in Java with Example

## Implementation with Examples
Inheritance is a fundamental concept in Java that allows you to create new classes (subclasses or derived classes) based on existing classes (superclasses or base classes). It promotes code reusability and establishes a relationship between classes where a subclass inherits the properties and behaviors of its superclass.
```java
// Superclass (Base Class)
class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void start() {
        System.out.println("The " + brand + " vehicle is starting.");
    }
}

// Subclass 1 (Derived Class)
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year); // Call the superclass constructor
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void accelerate() {
        System.out.println("The " + getBrand() + " car is accelerating.");
    }

    // Override the start() method
    @Override
    public void start() {
        System.out.println("The " + getBrand() + " car is starting with a key.");
    }
}

// Subclass 2 (Derived Class)
class Motorcycle extends Vehicle {
    public Motorcycle(String brand, int year) {
        super(brand, year);
    }

    public void accelerate() {
        System.out.println("The " + getBrand() + " motorcycle is revving its engine.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022, 4);
        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", 2022);

        System.out.println("Car Brand: " + myCar.getBrand());
        System.out.println("Car Year: " + myCar.getYear());
        System.out.println("Car Number of Doors: " + myCar.getNumberOfDoors());

        myCar.start();       // Overridden method in Car class
        myCar.accelerate();  // Subclass-specific method

        System.out.println();

        System.out.println("Motorcycle Brand: " + myMotorcycle.getBrand());
        System.out.println("Motorcycle Year: " + myMotorcycle.getYear());

        myMotorcycle.start();       // Inherited method from the superclass
        myMotorcycle.accelerate();  // Subclass-specific method
    }
}
```

## Types of Inheritance in Java

### Single Inheritance
In Java, single inheritance is a fundamental feature of the language. This means that a class can extend (inherit from) only one other class. This restriction helps in avoiding complexities and ambiguities that can arise in languages that support multiple inheritance. Single inheritance simplifies the class hierarchy and promotes a more straightforward and manageable code structure.
```java
// Superclass (Parent Class)
class Animal {}

// Subclass (Child Class) inheriting from Animal
class Dog extends Animal {}
```

### Multilevel Inheritance
Multilevel inheritance in Java is a type of inheritance where a subclass extends another subclass, creating a chain of inheritance relationships. In this scenario, each class serves as both a subclass (deriving from a superclass) and a superclass (serving as the parent class for another subclass). This results in a hierarchy of classes with a clear chain of inheritance.
```java
// Superclass (Parent Class)
class Animal {}

// Subclass 1 (Derived Class) inheriting from Animal
class Dog extends Animal {}

// Subclass 2 (Derived Class) inheriting from Dog
class GermanShepherd extends Dog {}
```

### Hierarchical Inheritance
Hierarchical inheritance in Java is a type of inheritance where multiple subclasses inherit from a single superclass, creating a hierarchy of classes. In this scenario, one superclass serves as the parent for several subclasses, and each subclass may have its specific behaviors or properties while inheriting common attributes from the same superclass.
```java
// Superclass (Parent Class)
class Shape {}

// Subclass 1 (Derived Class) inheriting from Shape
class Circle extends Shape {}

// Subclass 2 (Derived Class) inheriting from Shape
class Rectangle extends Shape {}
```

### Multiple Inheritance (Through Interfaces)
Multiple inheritance in Java is not supported for classes, meaning a class cannot directly inherit from more than one class. However, Java provides a mechanism for achieving multiple inheritance through interfaces.

In Java, a class can implement multiple interfaces, allowing it to inherit the abstract method signatures of multiple interfaces. This enables a form of multiple inheritance where a class can inherit the behavior of multiple sources, and it can define its own unique functionality as well.
```java
// Interface 1
interface Swimmer {}

// Interface 2
interface Flyer {}

// Class implementing both interfaces
class Bird implements Swimmer, Flyer {}
```

### Hybrid Inheritance(Through Interfaces)
Hybrid inheritance in Java is a combination of multiple inheritance and hierarchical inheritance achieved through the use of interfaces. It allows a class to inherit properties and behaviors from multiple sources, including both classes and interfaces. This results in a complex inheritance structure, combining aspects of both multiple and hierarchical inheritance.
```java
// Interface 1
interface Swimmer {}

// Interface 2
interface Flyer {}

// Superclass (Parent Class)
class Animal {}

// Subclass 1 (Derived Class) inheriting from Animal and implementing Swimmer
class Dolphin extends Animal implements Swimmer {}

// Subclass 2 (Derived Class) implementing Flyer
class Sparrow implements Flyer {}

// Subclass 3 (Derived Class) inheriting from Dolphin and implementing Flyer
class DolphinSparrow extends Dolphin implements Flyer {}
```

<details>
<summary>Full example</summary>

```java
// Interface 1
interface Swimmer {
    void swim();
}

// Interface 2
interface Flyer {
    void fly();
}

// Superclass (Parent Class)
class Animal {
    void eat() {
        System.out.println("The animal is eating.");
    }
}

// Subclass 1 (Derived Class) inheriting from Animal and implementing Swimmer
class Dolphin extends Animal implements Swimmer {
    @Override
    public void swim() {
        System.out.println("The dolphin is swimming.");
    }
}

// Subclass 2 (Derived Class) implementing Flyer
class Sparrow implements Flyer {
    @Override
    public void fly() {
        System.out.println("The sparrow is flying.");
    }

    void chirp() {
        System.out.println("The sparrow is chirping.");
    }
}

// Subclass 3 (Derived Class) inheriting from Dolphin and implementing Flyer
class DolphinSparrow extends Dolphin implements Flyer {
    @Override
    public void fly() {
        System.out.println("The DolphinSparrow is flying.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dolphin myDolphin = new Dolphin();
        Sparrow mySparrow = new Sparrow();
        DolphinSparrow myDolphinSparrow = new DolphinSparrow();

        myDolphin.eat();         // Inherited from Animal
        myDolphin.swim();        // Inherited from Swimmer interface
        mySparrow.fly();         // Inherited from Flyer interface
        mySparrow.chirp();       // Class-specific method
        myDolphinSparrow.fly();  // Inherited from DolphinSparrow
    }
}
```

</details>

## Why multiple inheritance is not supported in java?
* To reduce the complexity and simplify the language, multiple inheritances is not supported in java.
* Consider a scenario where A, B, and C are three classes. The C class inherits the A and B classes. If A and B classes have the same method and you call it from child class object, there will be ambiguity to call a method of A or B class.
* Since compile-time errors are better than runtime errors, java renders compile-time error if you inherit 2 classes. So whether you have the same method or different, there will be a compile-time error now.
```java
class A{  
    void msg(){System.out.println("Hello");}  
}  
class B{  
    void msg(){System.out.println("Welcome");}  
}  
class C extends A,B{//suppose if it were  
   
     Public Static void main(String args[]){  
          C obj=new C();  
          obj.msg();//Now which msg() method would be invoked?  
     }  
}
```

---