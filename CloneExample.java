public class CloneExample {
    public static class Person implements Cloneable {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        public static void main(String[] args) {
            Person person1 = new Person("Alice", 30);

            try {
                // Using the clone method to create a copy of the object
                Person person2 = (Person) person1.clone();

                // Modifying the copied object
                person2.name = "Bob";

                System.out.println("Original person: " + person1.name + ", " + person1.age);
                System.out.println("Cloned person: " + person2.name + ", " + person2.age);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
    }
}
