package lesson4_4;

public class Test {
    public static void main(String[] args) {
        User u1 = new User();
        User u2 = u1;

        System.out.println(u1);
        System.out.println(u2);

        User u3 = new User();
        System.out.println(u3);

        Cat cat1 = new Cat();

    }
}
