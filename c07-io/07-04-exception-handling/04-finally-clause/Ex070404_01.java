import java.io.*;

public class Ex070404_01
{
	public static void main(String[] args)
	{
		PrintWriter out = new PrintWriter("output.txt");
		try
		{
			writeData(out); // this may throw an exception
		}
		// finally does stuff before the termination due to an exception
		finally
		{
			out.close();
		}
	}
	public static void writeData(PrintWriter out)
	{
		out.println("Hello World!");
	}
}