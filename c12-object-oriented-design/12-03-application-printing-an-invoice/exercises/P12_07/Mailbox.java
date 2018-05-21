import java.util.ArrayList;

/*
Describes a mailbox
*/
public class Mailbox
{
    ArrayList<Message> messages;

    /**
     * Constructs a mailbox
     */
    public Mailbox()
    {
        messages = new ArrayList<Message>();
    }

    /**
     * Gets the messages
     * @return the messages
     */
    public ArrayList<Message> getMessages()
    {
        return messages;
    }

    /**
     * Adds a message to the mailbox
     */
    public void addMessage(Message message)
    {
        messages.add(message);
    }

    /**
     * Gets the string representing the state of the mailbox 
     * @return the state of the mailbox
     */
    public String toString()
    {
        String out = "";
        for (Message message : messages)
        {
            out += message.toString() + "\n";
        }
        return out;
    }
}