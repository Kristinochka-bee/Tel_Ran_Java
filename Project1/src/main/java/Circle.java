public class Circle implements Figure2D{

    private double radius;



    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimetr() {
        double perimetr = radius * Math.PI;
        return perimetr;
    }

    @Override
    public double calculateArea() {
        double circArea = Math.PI * radius*radius;
        return circArea;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
