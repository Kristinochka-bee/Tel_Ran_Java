public class Bullet extends Circle{

    private double radius;
    public Bullet() {
    }

    public Bullet(double radius) {
        this.radius= radius;

    }


    public double calculateVolume() {

        return super.calculateArea();
    }

    @Override
    public double calculateArea() {
      double area = 4 * Math.PI * radius*radius;
      return area;

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
