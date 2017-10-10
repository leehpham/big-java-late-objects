/*
added details to the example in the book
*/

import java.io.*;
import java.util.*;

public class Ex070402_02
{
	public static void main(String[] args)
	{
		try
		{
			String filename = "hoang.txt";

			// may throw an IOException
			Scanner in = new Scanner(new File(filename));

			// may throw a NoSuchElement exception
			String input = in.next();

			// may throw a NumberFormatException
			int value = Integer.parseInt(input);
			System.out.printf("%s\n", input);
		}
		catch(IOException exception)
		{
			// System.out.printf("the file is not there u foo!\n");
			// exception.printStackTrace();
			System.out.println(exception.getMessage());
		}
		catch(NumberFormatException exception)
		{
			System.out.println(exception.getMessage());
		}

		// after handling, program continues to execute
		System.out.println("Yes we are here?");
	}
}
