package kope;

public class Main {
    public static void main(String[] args) {
        try {
            // Specify the fully qualified class name including the package
            String className = "kope.MyClass";

            // Get the Class object using Class.forName()
            Class<?> myClass = Class.forName(className);

            // Create an instance of MyClass using newInstance()
            MyClass instance = (MyClass) myClass.newInstance();

            // Call a method on the created instance
            instance.printMessage();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

