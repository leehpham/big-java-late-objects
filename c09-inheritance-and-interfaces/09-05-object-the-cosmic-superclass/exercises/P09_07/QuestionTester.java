public class QuestionTester
{
    public static void main(String[] args)
    {
        Question q = new Question();

        q.setText("Who is the most handsome man?");
        q.setAnswer("Hoang Pham");
        System.out.println(q.toString());
    }
}