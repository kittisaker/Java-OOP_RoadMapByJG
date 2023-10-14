public class ObjectClassExample {
    public static void main(String[] args) {
        String str = "Hello, World";
        Integer number = 42;
        Object obj = new Object();

        // Using getClass() to get the runtime class of objects
        Class<? extends String> strClass = str.getClass();
        Class<? extends Integer> numberClass = number.getClass();
        Class<? extends Object> objClass = obj.getClass();

        System.out.println("The class of str: " + strClass.getName());
        System.out.println("The class of number: " + numberClass.getName());
        System.out.println("The class of obj: " + objClass.getName());

        // Checking class equality
        System.out.println("Is str's class equal to String class? " + (strClass == String.class));
        System.out.println("Is number's class equal to Integer class? " + (numberClass == Integer.class));
    }
}
