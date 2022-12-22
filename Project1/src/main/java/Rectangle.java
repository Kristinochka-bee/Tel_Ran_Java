public class Rectangle implements Figure2D {

    private double baseSide;
    private double side;

    public Rectangle() {
    }

    public Rectangle(double baseSide, double side) {
        this.baseSide = baseSide;
        this.side = side;
    }

    public void setBaseSide(double baseSide) {
        this.baseSide = baseSide;
    }

    public double getBaseSide() {
        return baseSide;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calculatePerimetr() {
        double P = 2 *(baseSide + side);
        return P;
    }

    @Override
    public double calculateArea() {
        double S = baseSide * side;
        return S;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "baseSide=" + baseSide +
                ", side=" + side +
                '}';
    }
}
