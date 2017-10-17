/*
* throwing an unchecked exception in a class method
*/

public class Ex070401_02
{
	public static void main(String[] args)
	{
		int withdrawAmount = 150;
		int balance = 100;
		alert(withdrawAmount, balance);
	}

	public static void alert(int withdrawAmount, int balance)
	{
		if (withdrawAmount > balance)
		{
			throw new RuntimeException("withdrawing too much there dawg!");
		}
	}
}