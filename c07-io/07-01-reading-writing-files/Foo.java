import java.util.*;
import java.io.*;

public class Foo
{
	public static void main(String[] args) throws IOException
	{
		File inputFile = new File("input.txt");
		Scanner in = new Scanner(inputFile);

		double total = 0.0;

		while(in.hasNextDouble())
		{
			double value = in.nextDouble();
			total = total + value;
		}
		in.close();

		PrintWriter out = new PrintWriter("output.txt");
		out.println("Hello, World!");
		out.printf("Total: %8.2f\n", total);
		out.close();
	}
}