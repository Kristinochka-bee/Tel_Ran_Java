package practic.extens;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.etat();
        animal.sleep();

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
        dog.showName();
    }
}
