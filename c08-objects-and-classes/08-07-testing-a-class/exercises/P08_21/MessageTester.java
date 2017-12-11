public class MessageTester
{
	public static void main(String[] args)
	{
		Message sample = new Message("Harry Morgan", "Rudolf Reindeer");

		sample.append("Merry Christmas");
		sample.append("Where is my gift?");

		System.out.println(sample.toString());		
	}
}