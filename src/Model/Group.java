package Model;

import java.util.List;

public class Group {
    private String name;
   private List <Student> student;

    public Group(String name, List<Student> student) {
        this.name = name;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", student=" + student +
                '}';
    }
}
