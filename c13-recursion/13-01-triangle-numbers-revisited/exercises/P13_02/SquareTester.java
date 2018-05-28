package exercises.P13_02;

public class SquareTester
{
    public static void main(String[] args)
    {
        boolean result = false;
        Square mySquare = new Square(5);
        if (mySquare.getArea() == 25) { result = true; }
        System.out.println(result);
    }
}