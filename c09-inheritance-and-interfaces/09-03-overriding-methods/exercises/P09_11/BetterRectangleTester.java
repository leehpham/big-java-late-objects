public class BetterRectangleTester
{
	public static void main(String[] args)
	{
		BetterRectangle rec = new BetterRectangle(4, 5);
		System.out.printf("Perimeter: %.2f\n", rec.getPerimeter());
		System.out.printf("Area: %.2f\n", rec.getArea());
	}
}