import java.util.ArrayList;

public class ChoiceQuestion extends Question 
{
	// This instance variable is added to the subclass
	private ArrayList<String> choices;

	/*
		Constructs a choice question with no choices
	*/
	public ChoiceQuestion()
	{
		choices = new ArrayList<String>();
	}

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
		// Display the question text
		super.display();

		// Display the answer choices
		for (int i = 0; i < choices.size(); i++)
		{
			int choiceNumber = i + 1;
			System.out.println(choiceNumber + ": " + choices.get(i));
		}
	}
}