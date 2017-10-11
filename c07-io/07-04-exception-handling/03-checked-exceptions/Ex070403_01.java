/*
* Checked exception
*/

import java.io.*;
import java.util.*;

public class Ex070403_01
{
	public static void main(String[] args)
	{
		// program can try to handle the exception 
		// when it calls the method
		try
		{
			readData("Hoang.txt");
		}
		catch(FileNotFoundException e)
		{
			// do something to handle the exception
		}
		// then continue to excecute here
	}

	public static String readData(String filename) 
		throws FileNotFoundException
	{
		File fp = new File(filename);
		Scanner in = new Scanner(fp);
		// ...
	}
}