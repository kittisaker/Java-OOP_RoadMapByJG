import java.util.Arrays;
import java.util.List;

public class TestComposition {
    public static void main(String[] args) {
        Professor prof1 = new Professor("1", "Dr.Kope");
        Professor prof2 = new Professor("2", "Dr.Jarvis");

        List<Professor> scienceProfessors = Arrays.asList(prof1, prof2);

        Department scienceDepartment = new Department("Science", scienceProfessors);

        System.out.println(scienceDepartment);

    }
}
