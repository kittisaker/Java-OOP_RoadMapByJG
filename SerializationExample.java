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
