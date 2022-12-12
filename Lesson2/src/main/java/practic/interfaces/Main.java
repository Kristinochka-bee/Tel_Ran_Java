package practic.interfaces;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
        outputInfo(animal1);
        outputInfo(person1);
/*
        Info info1 = new Animal(1);
        Info info2 = new Person("Mars");


 */
        //outputInfo(info1);
        //outputInfo(info2);

        //info1.showInfo();
        //info2.showInfo();

        /*
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
        animal1.showInfo();
        person1.showInfo();


         */
    }
    public static void outputInfo(Info info){
        info.showInfo();   //объединяющий метод 2-х классов*методов
    }
}
