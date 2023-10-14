# Java-OOP_RoadMapByJG : Chapter 3 What Are All the Different Ways to Create an Object in Java?

## 1. Using a new keyword
This is the most popular way of creating an object in java which we have discussed above, almost every Java Developer knows this methodology.

## 2. Using Object Deserialization
Certainly! Object deserialization is a process in Java that allows you to recreate objects from their serialized form. Here's an example of using object deserialization to create objects in Java:

* Create a Serializable Class:
Start by creating a serializable class, which should implement the Serializable interface. This interface is used to mark the class as serializable.
```java
import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
```

* Serialize the Object:
Serialize an object of the serializable class to a file or another storage medium.
```java
import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
        try {
            Person person = new Person("John Doe", 30);
            
            // Create an ObjectOutputStream to serialize the object
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("person.ser"));
            
            // Serialize the object
            outputStream.writeObject(person);
            
            // Close the output stream
            outputStream.close();
            
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

* Deserialize the Object:
Deserialize the object from the serialized data to recreate it.
```java
import java.io.*;

public class DeserializationExample {
    public static void main(String[] args) {
        try {
            // Create an ObjectInputStream to deserialize the object
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.ser"));
            
            // Deserialize the object
            Person deserializedPerson = (Person) inputStream.readObject();
            
            // Close the input stream
            inputStream.close();
            
            System.out.println("Object deserialized successfully.");
            System.out.println("Deserialized Person: " + deserializedPerson);
            System.out.println("Get name : " + deserializedPerson.getName());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

In this example:
* The Person class is marked as serializable, and we have a constructor and a toString method to represent a person's data.
* The SerializationExample class serializes a Person object to a file named "person.ser."
* The DeserializationExample class reads and deserializes the "person.ser" file, creating a new Person object from the serialized data.

Please make sure that you run the SerializationExample before running the DeserializationExample to have the serialized data ready for deserialization.

## 3. Using Object Cloning – clone() method
The clone() method is used to create a copy of an existing object, in order to the clone() method the corresponding class should have implemented a Cloneable interface which is again a Marker Interface. 
```java
public class Student implements Cloneable{
    private String name;
    private String college;
    
    public Student() {
    }

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
        Student student1 = new Student("Kittisak", "STOU");
        try {
            Student student2 = (Student) student1.clone();
            System.out.println(student2.getName());
            System.out.println(student2.getCollege());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
```

---

