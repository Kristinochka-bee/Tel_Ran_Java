import java.util.Arrays;

public class Pineaple extends Fruit {
    private int cellulose;

    public void setCellulose(int cellulose) {
        this.cellulose = cellulose;
    }
    public  int getCellulose(){
        return cellulose;
    }

    public Pineaple(){
        System.out.println("Constrictor of class Pinaple");
        System.out.println("Hash code:" + this.hashCode());
        System.out.println("Hash code super class : " + super.hashCode());

        System.out.println("Class name : " + this.getClass().getName());
        System.out.println("Super class name is : " + super.getClass().getName());


    }
public String toString() {

       return super.toString()  + "cellulose is:" + cellulose ;

    }
    public void addToSugar(int a){
        setSugar(getSugar() + a);
    }
    public void addToSugar(int a , int m){
        setSugar((getSugar() + a) *m);
    }
    @Override
    public void grow(){
        System.out.println("Im growing "); //переопределение абстрактного метода в фрут классе

    }
}
