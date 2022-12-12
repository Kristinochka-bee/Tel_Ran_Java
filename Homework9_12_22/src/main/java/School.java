import java.util.ArrayList;
import java.util.List;

public class School {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Bob","Petrov");
        students.add(student1);

        Student student2 = new Student("Kristina","Muntian");
        students.add(student2);

        Student student3 = new Student("Iryna", "Muntian");
        students.add(student3);

        Teacher teacher1 = new Teacher("Mrs Marry", "Belova");
        Teacher teacher2 = new Teacher("Mr Tom", "Kitov");
        Teacher teacher3 = new Teacher("Mr Boris", "Risker");


        teacher2.teach(Subject.QA ,students );
        teacher3.teach(Subject.Java,students);
        printInfo(students);

    }
    public static void printInfo(List<Student> students){
        for (Student student:students){
            System.out.println(student );
        }
    }
}
