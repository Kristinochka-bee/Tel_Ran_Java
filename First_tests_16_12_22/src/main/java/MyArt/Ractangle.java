package MyArt;

public class Ractangle extends Figure{


    public int calculateAreaOfSquare(int x, int y){
        int res = x * y;
        System.out.println("Считаю площадь фигуры " + res);
        return res;
    }

    public Ractangle(char symbol) {
        super(symbol);
    }

    @Override
    public void drawFigure(int a) {

    }


    public void drawFigure(int x , int y) {
        String line = "";
        for (int i = 0; i < x; i++) {
            line += "#";
        }
        for (int i = 0; i < y; i++) {
            System.out.println(line);
        }

    }

    @Override
    public void drawFigureOfTriagle(int a) {

    }

    @Override
    public void paintFigure() {

    }

    @Override
    public void drawFigure() {

    }
}
