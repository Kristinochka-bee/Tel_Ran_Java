package encapsulation;

public class Circle {
    private double radius;
    private double diameter;


    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
        if (radius * 2 == diameter){
            System.out.println("Everything is ok");
        }else {
            System.out.println("Write correct number");



        }



    }



    public Circle() {
        this.radius = 0;
        this.diameter = 0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void drawCircle(){
        if (this.radius * 2 == this.diameter){
            System.out.println("Everything is ok");
        }else {
            System.out.println("Write correct number");
        }

    }
}

