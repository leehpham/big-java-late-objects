/*
Implement a class SodaCan with methods getSurfaceArea() and getVolume().
In the constructor, supply the height and radius of the can.
*/

public class SodaCan
{
	private double heightInCm;
	private double radiusInCm;

	public SodaCan(double heightInCm, double radiusInCm)
	{
		this.heightInCm = heightInCm;
		this.radiusInCm = radiusInCm;
	}

	public double getSurfaceArea()
	{
		double surfaceArea = (2 * radiusInCm * Math.PI) * heightInCm;
		return surfaceArea;
	}

	public double getVolume()
	{
		double volume = (radiusInCm * radiusInCm * Math.PI) * heightInCm;
		return getVolume();
	}
}