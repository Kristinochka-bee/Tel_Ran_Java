import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(7474,"Xiaomi");
        Phone phone2 = new Phone(2670934, "IPhone",160);
        Phone phone3 = new Phone();
/*
        phone1.setModel("Samsung");
        phone1.setNumber(3809346);
        phone1.setWeight(120);
        phone1.receiveCall("Tim");

        phone2.setModel("LG");
        phone2.setNumber(3779340);
        phone2.setWeight(86);
        phone2.receiveCall("Bob");


        phone3.setModel("IPhone");
        phone3.setNumber(2670934);
        phone3.setWeight(160);
        phone3.receiveCall("Molly");

 */

        System.out.println(phone1.getNumber() +" " + phone1.getModel());
        System.out.println(phone2.getNumber() +" " + phone2.getModel() + " " + phone2.getWeight());

        phone1.receiveCall("Boris", 1518340520);
        phone1.sendMessage("lets go home" , 56578449);

        /*
        System.out.println(String.format("Calling : %s , number: %d " , phone1.getName(), phone1.getNumber()));
        System.out.println(String.format("Calling : %s , number: %d " , phone2.getName(), phone2.getNumber()));
        System.out.println(String.format("Calling : %s , number: %d " , phone3.getName(), phone3.getNumber()));


         */


/*
        System.out.println(String.format(" Model is : %s ,number %d , weight %d " , phone1.getModel(), phone1.getNumber(),phone1.getWeight()));
        System.out.println(String.format(" Model is : %s ,number %d , weight %d " , phone2.getModel(), phone2.getNumber(),phone2.getWeight()));
        System.out.println(String.format(" Model is : %s ,number %d , weight %d " , phone3.getModel(), phone3.getNumber(),phone3.getWeight()));


 */


    }
}
