public class UserTester
{
    public static void main(String[] args)
    {
        User user = new User("gloomyhair", "godeater01");
        user.getMailbox().addMessage(new Message(user.getUsername(), "User01", "Hey"));
        user.getMailbox().addMessage(new Message(user.getUsername(), "User02", "Are you read for this?"));
        user.getMailbox().addMessage(new Message(user.getUsername(), "User03", "It's not gonna be fun..."));
        // user.showMessages();
        System.out.println(user.sendMessage("bladerunner69", "Got anything going on tonight man?").toString());
        // System.out.println(user.toString());
    }
}