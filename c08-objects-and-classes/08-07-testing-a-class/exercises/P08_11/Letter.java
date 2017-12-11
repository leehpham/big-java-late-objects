// P8.11: Provide a class for authoring a simple letter. In the constructor, supply the names of 
// the sender and the recipient:
// public Letter(String from, String to)
// Supply a method
// public void addLine(String line)
// to add a line of text to the body of the letter. Supply a method
// public String getText()
// that returns the entire text of the letter. The text has the form:
// Dear recipient name:
// blank line
// first line of the body
// second line of the body
// ...
// last line of the body
// blank line
// Sincerely,
// blank line
// sender name
// Also supply a main method that prints this letter.
// Dear John:
// 
// I am sorry we must part.
// I wish you all the best.
// 
// Sincerely,
//
// Mary
// Construct an object of the Letter class and call addLine twice

public class Letter
{
	private String sender;
	private String recipient;
	private String body;

	public Letter(String from, String to)
	{
		sender = from;
		recipient = to;
		body = "";
	}

	public void addLine(String line)
	{
		body += line + "\n";
	}

	public String getText()
	{
		String text =	"Dear " + recipient + ":\n" +
						"\n" +
						body +
						"\n" +
						"Sincerely,\n" +
						"\n" +
						sender;
		return text;
	}
}