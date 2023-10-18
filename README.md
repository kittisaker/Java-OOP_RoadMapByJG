# Java-OOP_RoadMapByJG : Chapter 12 Aggregation in Java with Example

## Implementation with Example
Composition is a design principle in object-oriented programming where a class is composed of one or more objects from other classes, rather than inheriting properties and behaviors from them. This often stems from the <b>"has-a"</b> relationship rather than the "is-a" relationship of inheritance. Composition allows for greater flexibility and a more modular approach to building software, making it easier to change or replace parts of a system without affecting others.

Processor Class
```java
public class Processor {
    private String brand;
    private String model;
    
    public Processor(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString(){
        return "Processor[Brande : " + brand + ", Model : " + model + "]";
    }
}
```

Computer Class (Using Composition)
```java
public class Computer {
    private Processor processor;
    private String brand;
    
    public Computer(Processor processor, String brand) {
        this.processor = processor;
        this.brand = brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString(){
        return "Computer[Brand : " + brand + ", " + processor.toString() + "]";
    }
}
```

```java
public class TestComposition {
    public static void main(String[] args) {
        Processor intelProcessor = new Processor("Intel", "17");
        Computer dellComputer = new Computer(intelProcessor, "Dell");

        System.out.println(dellComputer);
    }
}
// Computer[Brand : Dell, Processor[Brande : Intel, Model : 17]]
```

Here, the Computer class doesn't inherit from the Processor class. Instead, it "has a" Processor. This demonstrates the principle of composition. If in the future, we need to change how the Processor class works or replace it with a different kind of processor, it won't affect the Computer class directly, showcasing the flexibility of composition.

---