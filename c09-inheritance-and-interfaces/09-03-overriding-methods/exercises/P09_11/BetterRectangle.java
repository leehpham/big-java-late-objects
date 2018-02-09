import java.awt.Rectangle;

public class BetterRectangle extends Rectangle 
{
    public BetterRectangle(int width, int height)
    {
        super(width, height);
    }

    public double getPerimeter()
	{
		double perimeter = 2 * (this.getWidth() + this.getHeight());
		return perimeter;
	}

	public double getArea()
	{
		double area = this.getWidth() * this.getHeight();
		return area;
	}
}