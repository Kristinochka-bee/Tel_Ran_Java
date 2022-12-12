package practic.abstrac;

import java.util.List;

public abstract class Teacher extends Human implements Teachable, Playable
{

    public Teacher(String name, int id) {
        super(name, id);
    }

    @Override
    public void introduseYourself() {
        System.out.println("im a teacher!");
    }


    @Override
    public void teach(Student student) {
        System.out.println("Teacher " + this.getName() + " teaches student " + student.getName());
    }


    public void teach(List<Student> student) {
        for (Student students : student);

    }

    @Override
    public void play() {
        System.out.println("I play chess ");
    }
}
