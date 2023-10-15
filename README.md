# Java-OOP_RoadMapByJG : Chapter 7 Encapsulation in Java with Example

## Implementation with Example
Encapsulation is one of the fundamental principles of object-oriented programming in Java. It refers to the concept of bundling data (attributes) and methods (functions) that operate on that data into a single unit called a class. This helps in protecting the data by restricting direct access to it from outside the class and providing controlled access through methods.

```java
public class Student {
    private String name;  // Private data member (attribute)
    private int age;       // Private data member (attribute)

    // Constructor to initialize the attributes
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method to access the name attribute
    public String getName() {
        return name;
    }

    // Setter method to modify the name attribute
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to access the age attribute
    public int getAge() {
        return age;
    }

    // Setter method to modify the age attribute
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("John", 20);

        // Access and modify attributes using getter and setter methods
        student.setName("Alice");
        student.setAge(22);

        // Display student information
        student.displayInfo();
    }
}
```

## Difference between Abstraction and Encapsulation 
* Encapsulation is a process of binding or wrapping the data and the codes that operate on the data into a single entity. This keeps the data safe from outside interface and misuse.
* Abstraction is the concept of hiding irrelevant details. In other words, make the complex system simple by hiding unnecessary detail from the user.
* Abstraction is implemented in Java using an interface and abstract class while Encapsulation is implemented using private, package-private, and protected access modifiers.
* Abstraction solves the problem at the design level. Whereas Encapsulation solves the problem at the implementation level.

---