
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String secondName;
    private List<SubjectTeacher> learnSubjectsTeacher;

    public Student(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
        this.learnSubjectsTeacher = new ArrayList<>();
    }

    public void learn (Subject subject,Teacher teacher)  {

        SubjectTeacher subjectTeacher = new SubjectTeacher(subject,teacher);

        if (!learnSubjectsTeacher.contains(subjectTeacher)){
            this.learnSubjectsTeacher.add(subjectTeacher);
        }
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", learnSubjects=" + learnSubjectsTeacher +
                '}';
    }


}
