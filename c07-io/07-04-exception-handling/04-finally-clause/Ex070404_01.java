import java.io.*;

public class Ex070404_01
{
	public static void main(String[] args)
	{
		PrintWriter out = new PrintWriter("output.txt");
		try
		{
			writeData(out);
		}
		finally
		{
			out.close();
		}
		// if something's wrong with method writeData
		// stuff in side finally always gets executed 1st b4 any handling
		catch(IOException e)
		{
			//
		}

		// may never get here
		// out.close(); 
	}

	public static void writeData(PrintWriter out)
	{
		out.println("Hello World!");
	}
}