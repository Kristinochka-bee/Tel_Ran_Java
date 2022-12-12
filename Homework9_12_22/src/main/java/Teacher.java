
import java.util.List;

public class Teacher {
    private String name;
    private String secondName;



    public Teacher(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public void teach(Subject subject, List<Student>students) {
        for (Student student:students) {
            student.learn(subject,this);
        }
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
