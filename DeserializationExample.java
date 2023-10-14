import java.io.*;

class MyClass implements Serializable {
    private String message;

    public MyClass(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Message from MyClass: " + message);
    }
}

class SerializationExample {
    public static void main(String[] args) {
        MyClass objectToSerialize = new MyClass("Hello, World!");

        try {
            // Create an ObjectOutputStream to serialize the object
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("serializedObject.ser"));

            // Serialize the object
            outputStream.writeObject(objectToSerialize);

            // Close the output stream
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class DeserializationExample {
    public static void main(String[] args) {
        MyClass deserializedObject = null;

        try {
            // Create an ObjectInputStream to deserialize the object
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("serializedObject.ser"));

            // Deserialize the object
            deserializedObject = (MyClass) inputStream.readObject();

            // Close the input stream
            inputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (deserializedObject != null) {
            deserializedObject.printMessage();
        }
    }
}
