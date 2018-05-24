/*
Describes a user.
*/
public class User
{
    private String username;
    private String password;
    private Mailbox mailbox;

    public User()
    {
        this.username = "";
        this.password = "";
        this.mailbox = new Mailbox();
    }
    
    /**
     * Constructs a user
     */
    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
        this.mailbox = new Mailbox();
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    /**
     * Gets username
     * @return the username
     */
    public String getUsername() { return username; }

    /**
     * Gets password
     * @return the password
     */
    public String getPassword() { return password; }

    /**
     * Gets mailbox
     * @return the mailbox
     */
    public Mailbox getMailbox() { return mailbox; }

    /**
     * Shows messages in a user's mailbox 
     */
    public void showMessages()
    {
        for (Message m : mailbox.getMessages())
        {
            System.out.println(m.toString());
        }
    }

    /**
     * Sends a message to another user
     */
    public Message sendMessage(String recipient, String text)
    {
        Message message = new Message(recipient, username, text);
        return message;
    }

    /**
     * Gets a string representing the state of a User object
     * @return the state of a User object
     */
    public String toString()
    {
        String out = String.format("Username: %s\nPassword: %s\nMailbox:\n%s",
                                    username, password, mailbox.toString());
        return out;
    }
}