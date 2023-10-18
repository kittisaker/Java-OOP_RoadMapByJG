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