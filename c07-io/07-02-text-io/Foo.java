import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Foo
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File fp = new File("input.txt");
		Scanner in = new Scanner(fp);
		// punctuation and numbers are not included the the words
		// in.useDelimiter("[^A-Za-z]+");

		// read one character at a time
		in.useDelimiter("");

		// String input;
		char ch;
		while(in.hasNext())
		{
			// input = in.next();
			ch = in.next().charAt(0);
			System.out.print(ch);
			if (Character.isDigit(ch))
				System.out.printf("\t is a digit\n");
			else if (Character.isLowerCase(ch))
				System.out.printf("\t is a lowercase\n");
			else if (Character.isUpperCase(ch))
				System.out.printf("\t is a upper case\n");
			else if (Character.isWhitespace(ch))
				System.out.printf("\t is a white space\n");
			else
				System.out.printf("\t wtf is this\n");
		}
	}
}