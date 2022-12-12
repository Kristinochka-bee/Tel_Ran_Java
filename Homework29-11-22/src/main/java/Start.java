public class Start {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.setModel("Samsung");
        phone1.setNumber(234578999);
        phone1.setWeight(200);

        phone1.receiveCall("Boris");
        System.out.println("Model: " + phone1.getModel()+ " "+" number: " + phone1.getNumber()+ " " +" weight: "+ phone1.getWeight() );



        Phone phone2 = new Phone();
        phone2.setModel("Iphone");
        phone2.setNumber(34565777);
        phone2.setWeight(201);

        phone2.receiveCall("Tim");
        System.out.println("Model: " + phone2.getModel()+ " "+" number: " + phone2.getNumber()+ " " +" weight: "+ phone2.getWeight());



        Phone phone3 = new Phone();
        phone3.setModel("Dell");
        phone3.setNumber(98756575);
        phone3.setWeight(205);

        phone3.receiveCall("Eva");
        System.out.println("Model: " + phone3.getModel()+ " "+" number: " + phone3.getNumber()+ " " +" weight: "+ phone3.getWeight());

    }




    }

