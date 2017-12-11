public class LetterTester
{
	public static void main(String[] args)
	{
		Letter sample = new Letter("Mary", "John");

		sample.addLine("I am sorry we must part.");
		sample.addLine("I wish you all the best.");

		System.out.println(sample.getText());
	}
}