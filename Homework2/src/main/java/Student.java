import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Student {

    private String name;
    private String lastName;

   private List <Subject> learntSubjects;
   private List<Subject> examsPassed;

    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.learntSubjects = new ArrayList<>();
        this.examsPassed = new ArrayList<>();
    }

    public void makeExam(Subject subject){
        int intAnswer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is 3+5?");
        intAnswer=scanner.nextInt();
        if (intAnswer==(8)){
            if (!this.examsPassed.contains(subject)){
                 this.examsPassed.add(subject);
            }
        }
    }
    public void learn(Subject subject) throws IllegalAccessException {
        if (subject == null){
            throw new IllegalAccessException("Subject is null");
        }
        if (!this.learntSubjects.contains(subject)){
            this.learntSubjects.add(subject);
        }
    }

    public List<Subject> getLearntSubjects() {
        return learntSubjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", learntSubjects=" + learntSubjects +
                ", examsPassed=" + examsPassed +
                '}';
    }
}
