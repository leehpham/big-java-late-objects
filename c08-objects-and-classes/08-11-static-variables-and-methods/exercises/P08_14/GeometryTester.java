import java.util.Scanner;

public class GeometryTester
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("r: ");
		double r = sc.nextDouble();
		System.out.print("h: ");
		double h = sc.nextDouble();

		System.out.printf("Sphere volume is %.2f\n", Geometry.sphereVolume(r));
		System.out.printf("Sphere surface area is %.2f\n", Geometry.sphereSurface(r));
		System.out.printf("Cylinder volume is %.2f\n", Geometry.cylinderVolume(r, h));
		System.out.printf("Cylinder surface area is %.2f\n", Geometry.cylinderSurface(r, h));
		System.out.printf("Cone volume is %.2f\n", Geometry.coneVolume(r, h));
		System.out.printf("Cone surface area is %.2f\n", Geometry.coneSurface(r, h));
	}
}