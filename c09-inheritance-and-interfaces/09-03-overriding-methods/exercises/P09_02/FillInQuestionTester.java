public class FillInQuestionTester
{
    public static void main(String[] args)
    {
        FillInQuestion q = new FillInQuestion();
        q.setText("The inventor of Java was ");
        q.display();
        q.setAnswer("James Gosling");
        System.out.println(q.checkAnswer("James Gosling"));
    }
}