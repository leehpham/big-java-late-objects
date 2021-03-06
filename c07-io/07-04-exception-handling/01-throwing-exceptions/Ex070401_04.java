/*
* throwing a checked exception in a class method
* must "declare" by doing "throws Exception"
*/

public class Ex070401_04
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
			throw new Exception("no can do!");
		}
	}
}