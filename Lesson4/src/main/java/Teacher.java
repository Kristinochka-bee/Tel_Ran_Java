public class Teacher extends Human{

    int lessonCounts;
    public Teacher(String name, String secondName) {
        super(name, secondName);
        lessonCounts=0;
    }

    @Override
    void bePresentOnLesson(String lessonID) {
        //we should check if lessonID is appro
        lessonCounts +=1;
    }

    @Override
    public void run() {
        System.out.println("Im teacher" + getName() + " and im running to University ");
    }

    @Override
    public void walk() {

    }
}
