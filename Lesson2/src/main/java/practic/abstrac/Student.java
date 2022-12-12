package practic.abstrac;

public class Student extends Human implements Playable {

    public Student(String name, int id) {
        super(name, id);
    }

    @Override
    public void introduseYourself() {
        System.out.println("Im a student");
    }

    @Override
    public void teach(String anastasia, Subjects geography) {

    }

    @Override
    public void play() {
        System.out.println("I play a volleyball");
    }
}
