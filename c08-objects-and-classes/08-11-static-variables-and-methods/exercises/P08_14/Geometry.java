// P8.14
import java.lang.Math.*;

public class Geometry
{
	public static double sphereVolume(double r)
	{
		double volume = ((double) 4/3) * Math.PI * Math.pow(r, 3);
		return volume;
	}

	public static double sphereSurface(double r)
	{
		double area = 4 * Math.PI * Math.pow(r, 2);
		return area;
	}

	public static double cylinderVolume(double r, double h)
	{
		double volume = Math.PI * Math.pow(r, 2) * h;
		return volume;
	}

	public static double cylinderSurface(double r, double h)
	{
		double area = 2 * Math.PI * r * h + 2 * Math.PI * Math.pow(r, 2);
		return area;
	}

	public static double coneVolume(double r, double h)
	{
		double volume = Math.PI * Math.pow(r, 2) * (h / 3);
		return volume;
	}

	public static double coneSurface(double r, double h)
	{
		double area = Math.PI * r * (r + Math.sqrt(h*h + r*r));
		return area;
	}
}