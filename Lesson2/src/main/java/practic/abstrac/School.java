package practic.abstrac;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class School {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(" Mrs Natalia", 764) {
            @Override
            public void teach(String anastasia, Subjects geography) {

            }
        };
        Teacher teacher1 = new Teacher(" Mrs Victoria", 337) {
            @Override
            public void teach(String anastasia, Subjects geography) {

            }
        };
        Student student = new Student("Nastia", 1);
        Student student1 = new Student("Nika", 2);

        //System.out.println(Arrays.asList(student1.getName(),student.getName(),
             //   teacher1.getName(),teacher.getName()));

        List<Human> peopleAtSchool = Arrays.asList(student1,student,teacher,teacher1);
        List<Student> studentsAtSchool = Arrays.asList(student1,student);



        for (Human human : peopleAtSchool) {
            System.out.println(human.getName());
            human.introduseYourself();
        }

        student.play();
        teacher.teach(student);
        teacher.play();


        List<Playable> players = Arrays.asList(student1,student,teacher,teacher1);
        for (Playable player : players){
            player.play();
        }
        teacher.teach(studentsAtSchool);
    }
}
