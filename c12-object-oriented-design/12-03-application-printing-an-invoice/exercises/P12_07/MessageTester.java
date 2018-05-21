public class MessageTester
{
    public static void main(String[] args)
    {
        Message m = new Message("Foo", "Bar", "How is your day going?");
        System.out.println(m.getRecipient());
        System.out.println(m.getSender());
        System.out.println(m.getText());
        System.out.println(m);
    }
}