package exercises.P13_02;

public class Square
{
    private int width;

    public Square(int width)
    {
        this.width = width;
    }

    public int getArea()
    {
        if (width == 1) { return 1; }
        Square smallerSquare = new Square(width - 1);
        int smallerArea = smallerSquare.getArea();
        return smallerArea + 2*(width - 1) + 1;
    }
}