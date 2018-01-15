public class ChoiceQuestion extends Question 
{
	public void addChoice(String choice)
	{
		this.addText("\n- " + choice);
	}
}