public class MailboxTester
{
    public static void main(String[] args)
    {
        Mailbox mailbox = new Mailbox();
        mailbox.addMessage(new Message("Tram", "Lee", "Long time no see!"));
        mailbox.addMessage(new Message("Lee", "Ngan Ha", "It's nice talking to you."));
        mailbox.addMessage(new Message("Trang", "Lee", "Why so quiet?"));
        System.out.println(mailbox.toString());
    }
}