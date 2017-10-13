import java.io.*;

public class Ex070404_02
{
	public static void main(String[] args)
	{
		int balance = 100;
		int withdrawAmount = 50;

		try
		{
			if(withdrawAmount > balance)
			{
				throw new IllegalArgumentException("amount is greater than balance");
			}
			System.out.println("tee hee");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("It's cool man!");
		}
		/*
		* BAD PRACTICE HERE!
		* DO NOT USE catch AND finally IN THE SAME try STATEMENT
		* 1st: syntax error if place finally right after try and before catch
		* 2nd: when placed after catch, finally is just a normal statement.
		*		It doesn't perform its special function anymore.
		*		Also, doing so will make it confusing when trying to understand the code.
		* SOL: only do try-catch or try-finally
		*/
		// finally
		{
			System.out.println("we still do this right?");
		}
		System.out.println("Are we here?");
	}
}