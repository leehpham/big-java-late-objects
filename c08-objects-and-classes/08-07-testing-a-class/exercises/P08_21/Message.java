/*
Design a class Message that models an e-mail message. A message has a recipient, a
sender, and a message text. Support the following methods:
* A constructor that takes the sender and recipient
* A method append that appends a line of text to the message body
* A method toString that makes the message into one long string like this: "From:
Harry Morgan\nTo: Rudolf Reindeer\n ..."
*/

public class Message
{
	private String recipient;
	private String sender;
	private String text;

	public Message(String sender, String recipient)
	{
		this.recipient = recipient;
		this.sender = sender;
		text = "";
	}

	public void append(String line)
	{
		text += "\n" + line;
	}

	public String toString()
	{
		String result;
		result = 	"From: Harry Morgan\n" +
					"To: Rudolf Reindeer" +
					text;
		return result;
	}
}