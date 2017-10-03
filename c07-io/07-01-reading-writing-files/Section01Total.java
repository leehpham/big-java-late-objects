import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
This program reads a file with numbers, and writes the numbers to another
file, lined up in a column and followed by their total.
*/
public class Section01Total
{
	public static void main(String[] args) throws FileNotFoundException
	{
		// Prompt for the input and output file names
		Scanner console = new Scanner(System.in);
		System.out.print("Input file: ");
		String inputFilename = console.next();
		System.out.print("Output file: ");
		String outputFilename = console.next();
		console.close();

		// construct the Scanner and PrintWriter objects for reading and writing
		File inputFile = new File(inputFilename);
		Scanner in = new Scanner(inputFile);
		PrintWriter out = new PrintWriter(outputFilename);

		// read the input and write the output
		double total = 0.0;
		double value;
		double avg = 0.0;
		double count = 0;


		while(in.hasNextDouble())
		{
			count++;
			value = in.nextDouble();
			if (count % 2 == 1)
				out.printf("%15.2f", value);
			if (count % 2 == 0)
				out.printf("%30.2f\n", value);
			total = total + value;
		}

		out.printf("Total: %8.2f\n", total);

		avg = total / count;
		out.printf("Avg: %8.2f\n", avg);

		in.close();
		out.close();
	}
}