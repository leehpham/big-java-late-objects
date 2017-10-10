
public class Ex070402_01
{
	public static void main(String[] args)
	{
		int balance = 100;
		int amount = 150;

		try
		{
			if (amount > balance)
			{
				// now what ?
				throw new IllegalArgumentException("Amount exceeds balance!");
				// exception is thrown but not handeld
				// thus error msg is printed
				// and program is terminated
			}
		}
		catch(IllegalArgumentException exception)
		{
			System.out.println("You poor ..");
		}
		int exceedAmount = amount - balance;
		System.out.printf("the exceed amount is %d\n", exceedAmount);
	}
}