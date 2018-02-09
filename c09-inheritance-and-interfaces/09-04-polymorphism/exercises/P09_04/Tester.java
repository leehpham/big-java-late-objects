public class Tester
{
    public static void main(String[] args)
    {
        AnyCorrectChoiceQuestion q = new AnyCorrectChoiceQuestion();

        q.setText("Is Hoang handsome?");
        q.addChoice("No", false);
        q.addChoice("Yes", true);
        q.addChoice("So so", false);
        q.addChoice("Super Handsome", true);

        q.display();
        System.out.println(q.checkAnswer("4"));
    }
}