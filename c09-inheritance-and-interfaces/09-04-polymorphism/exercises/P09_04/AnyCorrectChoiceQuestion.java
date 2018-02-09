import java.util.ArrayList;

public class AnyCorrectChoiceQuestion extends Question
{
    private ArrayList<String> choices;

    public AnyCorrectChoiceQuestion()
    {
        super();
        choices = new ArrayList<String>();
    }

    @Override
    public void setAnswer(String correctResponse)
    {
        super.setAnswer(super.getAnswer() + correctResponse + " ");
    }

    public void addChoice(String choice, boolean correct)
    {
        choices.add(choice);
        if (correct)
        {
            String choiceString = "" + choices.size();
            this.setAnswer(choiceString);
        }
    }

    public ArrayList<String> getChoices()
    {
        return choices;
    }

    @Override
    public boolean checkAnswer(String response)
    {
        boolean result = false;
        String[] tokens = super.getAnswer().split(" ");
        for (int i = 0; i < tokens.length; i++)
        {
            if (response.equals(tokens[i]))
            {
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public void display()
    {
        super.display();

        for (int i = 0; i < choices.size(); i++)
        {
            int choiceNumber = i + 1;
            System.out.println(choiceNumber + " " + choices.get(i));
        }
    }
}