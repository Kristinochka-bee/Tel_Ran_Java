import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IllegalAccessException {
/*
        Создать перечисление типа Subject с названием предметов в школе

        Создать списки предметов у учеников (с изученными предметами). При инициализации - пустые.

    Реализовать логику методов teach() у учителя с данными перечислениями, чтобы после выполнения teach()
        у соответсвующих учеников добавлялась информация о пройденном предмете.

        Продемонстрировать работу нового фунцкионала в класе School

 */

        List<Student> students = List.of(new Student("Vasya","Popov"),
                new Student("Ivan", "Dubov"),
                new Student("Vasya","Popov")
                );

        Techer techerQA = new Techer("Marina", "QA");
        Techer techerJava = new Techer("Tim", "Java");

        printStudents(students);
        techerQA.teach(Subject.QA,students);
        printStudents(students);
        techerQA.takeExam(Subject.QA,students);
        techerJava.takeExam(Subject.Java,students);
        printStudents(students);

    }

    private static void printStudents(List<Student> students) {
        for (Student student:students) {
            System.out.println(student);
        }
    }
}
