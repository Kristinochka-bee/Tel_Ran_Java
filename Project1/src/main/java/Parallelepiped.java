public class Parallelepiped extends Rectangle{
    private double height;

    public Parallelepiped (){

    }

    public Parallelepiped(double baseSide, double side, double height) {
        super(baseSide, side);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return super.calculateArea();
    }

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "height=" + height +
                '}';
    }
}
