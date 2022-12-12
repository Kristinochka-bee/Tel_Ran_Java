public class Phone {

    private int number;
    private String model ;
    private int weight ;
    private String name;

    public void setNumber(int number){
        this.number=number;
    }
    public int getNumber(){
        return number;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return model;
    }
    public void setWeight(int weight){
        this.weight= weight;
    }
    public int getWeight(){
        return weight;
    }

    public void receiveCall(String name){
        System.out.println("Calling  "+ name + " number: "+ number);
    }
}
