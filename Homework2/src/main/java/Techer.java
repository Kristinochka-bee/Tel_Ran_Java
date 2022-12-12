import java.util.List;

public class Techer {

    private String name;
    private String secondName;


    public Techer(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }
    public void teach (Subject subject, List<Student>students) throws IllegalAccessException {
        for (Student student:students) {
            student.learn(subject);
        }
    }
    public void takeExam(Subject subject,List<Student>students){
        for (Student student:students){
            student.makeExam(subject);
        }
    }

    @Override
    public String toString() {
        return "Techer{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}



