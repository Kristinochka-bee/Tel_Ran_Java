public class GeometrieTest {
    public static void main(String[] args) {

        Bullet bullet = new Bullet(4);
        System.out.println("Area of Bullet : " + bullet.calculateArea());

        Circle circle = new Circle(2);
        System.out.println("Area of circle : " + circle.calculateArea());
        System.out.println("Perimetr of Circle : " + circle.calculatePerimetr());

    }
}
