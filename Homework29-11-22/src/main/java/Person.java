public class Person {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Vasya", 22);


        person1.move();
        person1.talk();
    }

    private String fullName;
    private int age;

    public void move (){
        System.out.println("this Person can move well ");
    }
    public void talk (){
        System.out.println("and can talk 3 languages " );
    }

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
        System.out.println(fullName +" " +  age);
    }
}
