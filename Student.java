public class Student implements Cloneable{
    private String name;
    private String college;
    
    public Student() {
    }

    public Student(String name, String college) {
        this.name = name;
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Kittisak", "STOU");
        try {
            Student student2 = (Student) student1.clone();
            System.out.println(student2.getName());
            System.out.println(student2.getCollege());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
