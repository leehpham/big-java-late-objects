public class NumericQuestionTester
{
    public static void main(String[] args)
    {
        NumericQuestion q = new NumericQuestion();
        q.setText("3.023 - 2.009 = ?");
        q.setAnswer("1.014");
        System.out.println(q.checkAnswer("1"));
    }
}