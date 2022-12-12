public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Irina", "Pavlov");
        Student student2 = new Student("Sasha", "Ushnoi");
        Teacher teacher1 = new Teacher("Oksana", "Lebid");
        Teacher teacher2 = new Teacher("Tatijana", "Shimovski");

        DrawMovingObject  dmo = new DrawMovingObject();

        dmo.addObj(teacher1);
        dmo.addObj(teacher2);
        dmo.addObj(student1);
        dmo.addObj(student1);

        dmo.drawEveryoneRunning();



    }
}
