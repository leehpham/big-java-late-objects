/*
R7.1
Trying to open a file for reading that doesn't exist will throw FileNotFoundException.
Trying to open a file for writing that doesn't exist will force the program to create one.
*/

/*
R7.2
program throws FileNotFoundException (Permission denied)
*/
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class P7_01
{
	public static void main(String[] args) throws FileNotFoundException
	{
		// open a file with the name hello.txt
		PrintWriter out = new PrintWriter("hello.txt");
		// store the message "Hello, World!" in the file
		out.printf("Hello, World!\n");
		// close the file
		out.close();

		// open the same file again
		File fp = new File("hello.txt");
		// read the message into a string variable and print it
		Scanner sc = new Scanner(fp);

		String str;
		while(sc.hasNextLine())
		{
			str = sc.nextLine();
			System.out.println(str);
		}
		sc.close();
	}
}