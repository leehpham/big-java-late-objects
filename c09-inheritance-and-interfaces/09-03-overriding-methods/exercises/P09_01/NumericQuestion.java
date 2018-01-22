public class NumericQuestion extends Question
{
	
	public boolean checkAnswer(String response)
	{
		double numericResponse = Double.parseDouble(response);
	}
}