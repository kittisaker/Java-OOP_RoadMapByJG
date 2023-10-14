# Java-OOP_RoadMapByJG : Chapter 5 Java Interface

## Default Method in Interface

### The default interface method rules
```java
// Define a Vehicle interface with default methods that have return values
interface Vehicle {
    void start();

    void stop();

    int getFuelCapacity(); // Default method with a return value

    default String honk() {
        return "Default honk sound";
    }
}

// Create a Car class that implements the Vehicle interface
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public int getFuelCapacity() {
        return 50; // Car-specific fuel capacity
    }

    // Optionally override the default honk method
    @Override
    public String honk() {
        return "Car honking: Beep beep!";
    }
}

// Create a Boat class that implements the Vehicle interface
class Boat implements Vehicle {
    @Override
    public void start() {
        System.out.println("Boat started");
    }

    @Override
    public void stop() {
        System.out.println("Boat stopped");
    }

    @Override
    public int getFuelCapacity() {
        return 200; // Boat-specific fuel capacity
    }

    // Boat doesn't provide an explicit implementation for the default honk method
}

// Create a Motorcycle class that implements the Vehicle interface
class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle started");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped");
    }

    @Override
    public int getFuelCapacity() {
        return 20; // Motorcycle-specific fuel capacity
    }

    // Optionally override the default honk method
    @Override
    public String honk() {
        return "Motorcycle honking: Vroom!";
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();
        System.out.println("Car's fuel capacity: " + car.getFuelCapacity());
        System.out.println("Car honk: " + car.honk());

        Vehicle boat = new Boat();
        boat.start();
        boat.stop();
        System.out.println("Boat's fuel capacity: " + boat.getFuelCapacity());
        System.out.println("Boat honk: " + boat.honk());

        Vehicle motorcycle = new Motorcycle();
        motorcycle.start();
        motorcycle.stop();
        System.out.println("Motorcycle's fuel capacity: " + motorcycle.getFuelCapacity());
        System.out.println("Motorcycle honk: " + motorcycle.honk());
        
        // Accessing the default honk method from the interface itself
        Vehicle defaultVehicle = new Vehicle() {
            // Anonymous class implementing Vehicle with no additional methods
        };
        System.out.println("Default honk: " + defaultVehicle.honk());
    }
}
// Car started
// Car stopped
// Car's fuel capacity: 50
// Car honk: Car honking: Beep beep!
// Boat started
// Boat stopped
// Boat's fuel capacity: 200
// Boat honk: Default honk sound
// Motorcycle started
// Motorcycle stopped
// Motorcycle's fuel capacity: 20
// Motorcycle honk: Motorcycle honking: Vroom!
// Default honk: Default honk sound
```

### Multiple Interface Inheritance Rules

First, let's define the Vehicle and Alarm interfaces:
```java
// Define a Vehicle interface with default methods that have return values
interface Vehicle {
    void start();
    void stop();
    int getFuelCapacity();
    
    default String honk() {
        return "Default honk sound";
    }
}

// Define an Alarm interface with a method that returns a boolean
interface Alarm {
    boolean isAlarmOn();
}
```

Now, let's create a class Car that implements both the Vehicle and Alarm interfaces:
```java
class Car implements Vehicle, Alarm {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public int getFuelCapacity() {
        return 50; // Car-specific fuel capacity
    }

    @Override
    public boolean isAlarmOn() {
        return false; // Car-specific alarm status
    }

    // Optionally override the default honk method
    @Override
    public String honk() {
        return "Car honking: Beep beep!";
    }
}
```

Now, you can create an instance of the Car class and call methods from both the Vehicle and Alarm interfaces:
```java
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
        System.out.println("Car's fuel capacity: " + car.getFuelCapacity());
        System.out.println("Car honk: " + car.honk());
        System.out.println("Car alarm status: " + car.isAlarmOn());
    }
}
// Car started
// Car stopped
// Car's fuel capacity: 50
// Car honk: Car honking: Beep beep!
// Car alarm status: false
```

## Static Method in Interface

### The static interface method rules
```java
// Define a Vehicle interface with a static method
interface Vehicle {
    void start();
    void stop();
    
    static void info() {
        System.out.println("This is a Vehicle interface.");
    }
}

// Create a Car class that implements the Vehicle interface
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
        
        // Access the static method from the interface
        Vehicle.info();
    }
}
```

---