public class ChoiceQuestionTester
{
    public static void main(String[] args)
    {
        ChoiceQuestion q = new ChoiceQuestion();

        q.setText("Who is the most handsome?");
        q.addChoice("Foo Bar", false);
        q.addChoice("Lee Pham", true);
        q.addChoice("Bar Foo", false);
        
        System.out.println(q.toString());
    }
}