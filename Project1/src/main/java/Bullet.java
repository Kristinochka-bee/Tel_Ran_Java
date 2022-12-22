public class Bullet extends Circle{

    private double radius;

    public Bullet() {
    }

    public Bullet(double radius) {
        this.radius= radius;

    }


    public double calculateVolume() {
        double bullVolume= 4 * Math.PI * radius * radius * radius / 3;
        return bullVolume;
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
