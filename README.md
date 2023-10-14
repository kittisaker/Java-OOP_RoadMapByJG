# Java-OOP_RoadMapByJG : Chapter 4 java.lang.Object Class Methods with Examples

## equals(Object obj)
The <b>equals(Object obj)</b> method in the <b>java.lang.Object</b> class is used to compare the current object with another object for equality. It's a fundamental method for object comparison in Java, and it's often overridden in custom classes to provide meaningful equality checks.
```java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj){
        // Check if the object is compared with itself
        if (this == obj) {
            return true;
        }

        // Check if the object is null or not an instance of the same class
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Cast the object to the same class
        Person other = (Person) obj;

        // Compare fields for equality
        return age == other.age && name.equals(other.name);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);
        Person person3 = new Person("Bob", 25);

        // Using the overridden equals method to compare objects
        boolean areEqual1 = person1.equals(person2); // true
        boolean areEqual2 = person1.equals(person3); // false

        System.out.println("Are person1 and person2 equal? " + areEqual1);
        System.out.println("Are person1 and person3 equal? " + areEqual2);
    }
}
```

## hashCode()
The <b>hashCode()</b> method in the <b>java.lang.Object</b> class is used to return a hash code value for an object. This method is often overridden in custom classes when the <b>equals(Object obj)</b> method is overridden because objects that are considered equal should produce the same hash code.
```java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        // Implementation of the equals method as shown in a previous example
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Person other = (Person) obj;

        return age == other.age && name.equals(other.name);
    }

    @Override
    public int hashCode() {
        // Custom hash code generation based on fields used in equals method
        int result = name.hashCode();
        result = 31 * result + age; 
        return result;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);

        // Using the overridden equals method for comparison
        boolean areEqual = person1.equals(person2); // true

        // Using the overridden hashCode method to obtain hash codes
        int hash1 = person1.hashCode();
        int hash2 = person2.hashCode();

        System.out.println("Are person1 and person2 equal? " + areEqual);   // Are person1 and person2 equal? true
        System.out.println("Hash code of person1: " + hash1);               // Hash code of person1: 1963861438
        System.out.println("Hash code of person2: " + hash2);               // Hash code of person2: 1963861438
    }
}
```
The number 31 is often used as a prime number to help reduce collisions when combining hash codes. This is just a convention, and you can choose a different prime number or a different strategy for combining hash codes.


## toString()
The toString() method in the java.lang.Object class is used to return a string representation of an object. This method is commonly overridden in custom classes to provide a meaningful string representation for objects.
```java
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
```

## getClass()
This method returns the runtime class of the object. It is often used to obtain information about the class of an object.
```java
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
```

## notify(), notifyAll(), and wait()
The <b>java.lang.Object</b> class provides methods for synchronization and inter-thread communication, such as <b>notify(), notifyAll()</b>, and <b>wait()</b>. These methods are commonly used in multi-threaded Java applications to coordinate the execution of threads.

```java
public class NotificationExample {
    public static void main(String[] args) {
        final Object lock = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 1 is working.");
                try {
                    lock.wait();  // Thread 1 waits for a notification
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1 is awake.");
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 2 is working.");
                try {
                    lock.wait();  // Thread 2 waits for a notification
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2 is awake.");
            }
        });

        Thread thread3 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 3 is notifying other threads.");
                lock.notifyAll();  // Notify all waiting threads
            }
        });

        thread1.start();
        thread2.start();

        // Sleep to ensure threads 1 and 2 start waiting before thread 3 notifies them
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread3.start();
    }
}

// Output :
// Thread 1 is working.
// Thread 2 is working.
// Thread 3 is notifying other threads.
// Thread 1 is awake.
// Thread 2 is awake.
```


## finalize()
This method is called by the garbage collector before an object is reclaimed. It can be overridden to perform cleanup tasks.
```java
public class FinalizeExample {
    public static class MyResource {
        // Constructor
        public MyResource() {
            System.out.println("Resource acquired.");
        }

        // Cleanup method
        public void close() {
            System.out.println("Resource closed.");
        }

        @Override
        protected void finalize() throws Throwable {
            try {
                close(); // Perform cleanup
            } finally {
                super.finalize();
            }
        }
    }

    public static void main(String[] args) {
        MyResource resource = new MyResource();

        // Simulate the object becoming unreachable and eligible for garbage collection
        resource = null;

        // Suggesting garbage collection (for demonstration purposes)
        System.gc();

        // Give some time for the finalization to occur
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Output: 
// Note: FinalizeExample.java uses or overrides a deprecated API.
// Note: Recompile with -Xlint:deprecation for details.
// Resource acquired.
// Resource closed.
```

## clone()
The clone() method in the java.lang.Object class is used for creating a copy of an object. This method is typically overridden in custom classes to provide meaningful cloning behavior. In order to use clone(), the class must implement the Cloneable interface and override the clone() method.
```java
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
// Output :
// Original person: Alice, 30
// Cloned person: Bob, 30
```

---