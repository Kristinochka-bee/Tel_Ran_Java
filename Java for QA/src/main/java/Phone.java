import java.util.Arrays;

public class Phone {
    private int number;
    private String model;
    private int weight;
    private String name;

    private  String message;

    public Phone() {
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }



    public void setNumber(int number){
        this.number=number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void receiveCall(String name){
        this.name = name;
    }
    public void receiveCall(String name, int number){
        this.name = name;
        this.number=number;
        System.out.println("Name " + name + "\n number: " + number);
    }
    public void sendMessage(String message, int number){
        this.message=message;
        this.number=number;
        System.out.println(number);
    }

    }


