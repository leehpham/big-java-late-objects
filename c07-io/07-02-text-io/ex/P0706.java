/*
SC 6.
word:Hello,
input: World!
*/

import java.util.Scanner;

public class P0706
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner("Hello, World!");

		String word = sc.next();
		String input = sc.nextLine();

		System.out.printf("word:%s\n", word);
		System.out.printf("input:%s\n", input);
	}
}