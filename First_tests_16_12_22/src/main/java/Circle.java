public class Circle {
    private double radius;
    private double diameter;

    public Circle( Diametr diameter) {
        this.diameter = diameter.getDiametr();
    }

    public Circle(Radius radius) {
        this.radius = radius.getRadius();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }
}
