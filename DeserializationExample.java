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
