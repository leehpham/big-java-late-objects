import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Ex070204
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File fp = new File("07_02_04_input.txt");
		Scanner in = new Scanner(fp);

		while (in.hasNextLine())
		{
			String line = in.nextLine();

			// process line
			// locate the first digit
			int i = 0;
			while (!Character.isDigit(line.charAt(i))) { i++; }

			// extract the country name 
			String countryName = line.substring(0, i);
			String population = line.substring(i);

			// trim country name
			countryName = countryName.trim();

			System.out.printf("%s\t%s\n", population, countryName);
		}
	}
}