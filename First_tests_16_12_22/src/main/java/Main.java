import MyArt.Ractangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(new Diametr(4));
        System.out.println(circle);

        Ractangle ractangle = new Ractangle('#');
        ractangle.calculateAreaOfSquare(4,2);
        ractangle.drawFigure(4,2);
    }
}
