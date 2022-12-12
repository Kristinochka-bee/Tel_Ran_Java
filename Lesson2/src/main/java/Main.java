public class Main {
    public static void main(String[] args) {
        Pineaple pineaple = new Pineaple();
        pineaple.setSugar(10);
        pineaple.setVitamins(new String[]{"A","B"});
        pineaple.setCellulose(3);
        System.out.println(pineaple);

        //Fruit fruit = new Fruit();
        //System.out.println(fruit);

        System.out.println(pineaple.toString());

        pineaple.addToSugar(3);

        pineaple.addToSugar(2,6);
        System.out.println(pineaple);


        Summator summator = new Summator();
       String res1 = summator.sum("Ira "," Vanya");
       int res2 = summator.sum(10,20);
       double res3 = summator.sum(12.2,18.5);




       //String inputString = "res1 is : %s , res2 is: %d , res3 is : %f ";
        //String outputString = String.format(inputString, res1,res2,res3 );
        //sout(outputString)

        System.out.println(
                String.format(
                        "res1 is : %s , res2 is: %d , res3 is : %f ", res1,res2,res3
                )
        );


        Parent p1 = new Parent(); //Parent Class
        Parent p2 = new Child(14); //Child class
        p1.show(); //colling show  method in Parent class
        p2.show();// colling show override method in child class

        pineaple.grow();
    }
}
