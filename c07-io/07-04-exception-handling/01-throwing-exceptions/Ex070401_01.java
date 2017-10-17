/*
* throwing an unchecked exception in main
* throw -> print error msg -> terminate
*/

public class Ex070401_01
{
	public static void main(String[] args)
	{
		int withdrawAmount = 150;
		int balance = 100;
		if (withdrawAmount > balance)
		{
			throw new RuntimeException("withdrawing too much there dawg!");
		}
	}
}