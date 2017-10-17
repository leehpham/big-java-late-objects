/*
* throwing a checked exception in main
* must "declare" by doing "throws Exception"
*/

public class Ex070401_03
{
	public static void main(String[] args)
		throws Exception
	{
		int withdrawAmount = 150;
		int balance = 100;

		if (withdrawAmount > balance)
		{
			throw new Exception("no can do!");
		}
	}
}