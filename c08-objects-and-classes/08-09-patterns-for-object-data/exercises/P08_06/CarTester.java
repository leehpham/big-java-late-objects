public class CarTester
{
	public static void main(String[] args)
	{
		Car myHybrid = new Car(50);

		myHybrid.addGas(20);
		System.out.println("Expected: 20");
		System.out.println(myHybrid.getGasLevel());

		myHybrid.drive(100);
		System.out.println("Expected: 18");
		System.out.println(myHybrid.getGasLevel());
	}
}