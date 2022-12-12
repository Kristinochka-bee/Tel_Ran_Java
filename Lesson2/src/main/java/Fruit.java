import java.util.Arrays;

abstract class Fruit {
    private String[] vitamins;
    private int sugar;

    public Fruit(){
        System.out.println("Constructor of class Fruit");
        System.out.println("Hash code: " + this.hashCode());
        System.out.println("Class name: "+ this.getClass().getName());
    }
    public String[] getVitamins(){
        return vitamins;
    }
    public int getSugar(){
        return sugar;
    }
    public void setVitamins(String[] vitamins){
        this.vitamins= vitamins;
    }
    public void setSugar(int sugar){
        this.sugar=sugar;
    }
    public String toString(){
        return String.format(
                "sugar: %d vitamins %s", sugar, Arrays.toString(vitamins)
        );
        }
        abstract void grow();
    }

