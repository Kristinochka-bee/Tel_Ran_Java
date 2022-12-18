package MyArt;

public class Square extends Figure {
    private int side;


    public Square(char symbol,  int side) {
        super(symbol);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int calculateAreaOfSquare(int x){
        int res = x * x;
        System.out.println("Площадь квадрата равна :"  + res);
        return res;
    }


    @Override
    public void drawFigure(int a) {
        String line="";
        for (int j = 0; j < a; j++) {
            line+="#";
        }
        for (int i = 0; i < a; i++) {
            System.out.println(line);
        }
    }

    @Override
    public void drawFigureOfTriagle(int a) {

    }

    @Override
    public void paintFigure() {
      //поменяет цвет фигуры
        System.out.println("Я меняю цвет фигуры ");
    }

    @Override
    public void drawFigure() {

    }
}
