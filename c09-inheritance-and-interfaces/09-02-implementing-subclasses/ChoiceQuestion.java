public class ChoiceQuestion extends Question 
{
	// This instance variable is added to the subclass
	private ArrayList<String> choices;

	// This method is added to the subclass
	public void addChoice(String choice, boolean correct)
	{
		choices.add(choice);
		if (correct)
		{
			// Convert choices.size() to string
			String choiceString = "" + choices.size();
			this.setAnswer(choiceString);
		}
	}

	// This method overrides a method from the superclass
	public void display()
	{

	}
}