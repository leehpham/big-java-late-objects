import java.text.*;

public class NumericQuestion extends Question
{
	@Override
	public boolean checkAnswer(String response)
	{
		double numericResponse = Double.parseDouble(response);
		double answer = Double.parseDouble(this.getAnswer());
		double diff = Math.abs(answer - numericResponse);
		DecimalFormat df = new DecimalFormat("#.##");
		diff = Double.parseDouble(df.format(diff));
		System.out.println("the difference is " + diff);
		if (diff <= 0.01)
			return true;
		else
			return false;
	}
}