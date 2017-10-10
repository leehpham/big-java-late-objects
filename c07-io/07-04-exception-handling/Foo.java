

public class Foo
{
	public static void main(String[] args)
	{
		int balance = 100;
		int amount = 150;

		if (amount > balance)
		{
			// now what ?
			throw new IllegalArgumentException("Amount exceeds balance!");
		}
		int exceedAmount = amount - balance;
		System.out.printf("the exceed amount is %d\n", exceedAmount);
	}
}