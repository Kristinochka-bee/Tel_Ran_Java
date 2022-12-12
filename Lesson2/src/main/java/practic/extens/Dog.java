package practic.extens;

public class Dog extends Animal{

    public void eat(){
        System.out.println("I eating meat");
    }
    public void bark(){
        System.out.println("Im barking");
    }

    public void showName(){
        System.out.println(name = "Bob"); //переопределили поле с именем
    }
}
