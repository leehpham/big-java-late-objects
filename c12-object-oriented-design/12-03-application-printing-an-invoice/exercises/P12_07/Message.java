/*
Describes a message
*/
public class Message
{
    private String recipient;
    private String sender;
    private String text;

    /**
     * Constructs a message
     * @param recipient the recipient
     * @param sender the sender
     * @param text the text
     */
    public Message(String recipient, String sender, String text)
    {
        this.recipient = recipient;
        this.sender = sender;
        this.text = text;
    }

    /**
     * Gets the recipient
     * @return the recipient
     */
    public String getRecipient() { return recipient; }

    /**
     * Gets the sender
     * @return the sender
     */
    public String getSender() { return sender; }

    /**
     * Gets the text
     * @return the text
     */
    public String getText() { return text; }

    /**
     * Gets a string representing the state of a Message object
     */
    public String toString()
    {
        String out = String.format("From: %s\nTo: %s\n\t%s", sender, recipient, text);
        return out;
    }
}