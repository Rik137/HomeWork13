import java.util.Objects;

public class Student {
    private String name;
    private String grope;
    private String studentID;

    public Student(String name, String grope, String studentID) {
        this.name = name;
        this.grope = grope;
        this.studentID = studentID;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !obj.getClass().equals(Student.class)) return false;
        Student st = (Student) obj;
        return studentID.equals(st.studentID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID);
    }

    @Override
    public String toString() {
        return "[" + name + ", " + grope + ", " + studentID + "]"  + "\n";
    }
}
