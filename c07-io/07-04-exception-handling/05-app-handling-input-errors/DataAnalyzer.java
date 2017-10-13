/*
The program asks user for the name of a file. The file is expected to contain value.
The 1st line of the file should contain the total number of values, and the 
remaining lines contain the data. Ex:
3
1.45
-2.1
0.05

1. Ask urself what can go wrong?
- The file might not exist.
- The file might have data in the wrong format

2. For each exception, decide which part of your program can competently handle it.
- main will handle all of the exceptions
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class DataAnalyzer
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		// Keep trying until there are no more exceptions
		boolean done = false;
		while(!done)
		{
			try
			{
				// prompt user for file name
				System.out.print("Please enter the file name: ");
				String filename = in.next();
				
				double[] data = readFile(filename); // all exceptions are thrown here

				// If no exceptions, everything is good, now we do work
				// process data

				System.out.printf("The sum is %.2f\n", sum(data));
				done = true;
			}
			catch(FileNotFoundException exception)
			{
				System.out.println("File not found.");
			}
			catch(NoSuchElementException exception)
			{
				System.out.println("File contents invalid.");
			}
			catch(IOException exception)
			{
				exception.printStackTrace();
			}
		}
	}

	/*
	* Open the file, put a scanner on it.
	* readFile does not handle any exceptions. If there is a problem with the input file, 
	it simply passe the exception to its caller.
	*/
	public static double[] readFile(String filename)
		throws IOException
	{
		File inFile = new File(filename); // the file might not exist
		Scanner in = new Scanner(inFile);
		try
		{
			return readData(in); // if this throws exceptions ...
		}
		// before the termination, close the file, readFile does not handle exceptions
		finally
		{
			in.close();
		}
	}

	/*
	* Manipulate the Scanner to read and process data
	* 
	*/
	public static double[] readData(Scanner in)
		throws IOException
	{
		int numberOfValues = in.nextInt(); // may throw NoSuchElementException
		double[] data = new double[numberOfValues];

		for(int i = 0; i < numberOfValues; i++)
		{
			data[i] = in.nextDouble(); // may throw NoSuchElementException
		}

		if(in.hasNext())
		{
			throw new IOException("End of file expected");
		}
		return data;
	}

	/*
	*
	*/
	public static double sum(double[] arrayOfInputs)
	{
		double sum = 0;
		for(int i = 0; i < arrayOfInputs.length; i++)
		{
			sum = sum + arrayOfInputs[i];
		}
		return sum;
	}
}