package MyArt;

public abstract class Figure  {
    private char symbol;


    public Figure(char symbol) {
        this.symbol = symbol;

    }

    public int calculateAreaOfSquare(int x) {
        System.out.println("Считаю площадь фигуры ");
        return x;
    }


    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }



    protected void calculateAreaOfTriangle(double sqrt) {
    }

    public abstract void drawFigure(int a);

    public abstract void drawFigureOfTriagle(int a);

    public abstract void paintFigure();

    public abstract void drawFigure();
}