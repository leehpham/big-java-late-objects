public class QuestionTester
{
	public static void main(String[] args)
	{
		ChoiceQuestion q = new ChoiceQuestion();
		q.setText("Boobs or asses?");
		q.addChoice("Boobs");
		q.addChoice("Asses");
		q.addChoice("Both");
		q.setAnswer("Both");
		q.display();
		System.out.println(q.checkAnswer("Both"));
	}
}