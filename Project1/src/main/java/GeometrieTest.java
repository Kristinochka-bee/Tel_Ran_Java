public class GeometrieTest {
    public static void main(String[] args) {

        Bullet bullet = new Bullet(4);
        System.out.println("Area of Bullet : " + bullet.calculateArea());
        System.out.println("Volume of Bullet : " + bullet.calculateVolume());

        Circle circle = new Circle(2);
        System.out.println("Area of circle : " + circle.calculateArea());
        System.out.println("Perimeter of Circle : " + circle.calculatePerimetr());

        Rectangle rectangle = new Rectangle();
        rectangle.setBaseSide(4);
        rectangle.setSide(2);
        System.out.println("Perimeter of Rectangle : " + rectangle.calculatePerimetr() + ";" + " Area of Rectangle : " + rectangle.calculateArea());

        Parallelepiped parallelepiped = new Parallelepiped();
        parallelepiped.setBaseSide(6);
        parallelepiped.setSide(8);
        parallelepiped.setHeight(12);
        System.out.println("Area of Parallelepiped : " + parallelepiped.calculateArea());




    }
}
