# Java-OOP_RoadMapByJG : Chapter 11 Composition in Java with Example

## Composition in Java with Example
In this example, the Department class will have a list of Professor objects, thereby illustrating a <b>"has-a"</b> relationship (i.e., a department has professors).

```java
public class Professor {
    private String id;
    private String name;
    
    public Professor(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Professor[ID: " + id + ", Name: " + name + "]";
    }
}
```

```java
import java.util.List;

public class Department {
    private String name;
    private List<Professor> professors;
    
    public Department(String name, List<Professor> professors) {
        this.name = name;
        this.professors = professors;
    }

    public String getName() {
        return name;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    @Override
    public String toString() {
        return "Department[Name: " + name + ", Professors: " + professors + "]";
    }
}
```

```java
import java.util.Arrays;
import java.util.List;

public class TestComposition {
    public static void main(String[] args) {
        Professor prof1 = new Professor("1", "Dr.Kope");
        Professor prof2 = new Professor("2", "Dr.Jarvis");

        List<Professor> scienceProfessors = Arrays.asList(prof1, prof2);

        Department scienceDepartment = new Department("Science", scienceProfessors);

        System.out.println(scienceDepartment); // Department[Name: Science, Professors: [Professor[ID: 1, Name: Dr.Kope], Professor[ID: 2, Name: Dr.Jarvis]]]

    }
}
```

Benefits of this approach:

- Encapsulation: The internal details of Professor are hidden from the Department. Changes inside Professor will not affect Department unless the public API of Professor is changed.

- Flexibility: We can easily add more attributes or behaviors to the Professor class without affecting the Department class. Similarly, we can add or remove professors from a department without changing the internal workings of the Professor class.

- Reusability: The Professor class can be used in other scenarios or parts of the system, not just within a department. For instance, a Course class could also have a Professor.

- Maintenance: It's easier to maintain and extend the code. For example, if we need to add attributes like salary or methods like promote() to the Professor class, the Department class remains unaffected.

This is a more tangible example of how composition can be effectively used in object-oriented design to establish relationships between classes without relying on inheritance.

---