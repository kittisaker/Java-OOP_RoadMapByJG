public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age +'}';
    }

    public static void main(String[] args) {
        Person person = new Person("Alice", 30);

        // Using the overridden toString method to obtain a string representation
        String personInfo = person.toString();

        System.out.println("Person Info: " + personInfo);   // Person Info: Person{name='Alice', age=30}
    }
}
