/*
	A question with a text and an answer
*/

public class Question
{
	private String text;
	private String answer;

	/*
		Constructs a question with empty question and answer
	*/
	public Question()
	{
		text = "";
		answer = "";
	}

	/*
		Sets the question text.
		@param questionText the text of this question
	*/
	public void setText(String questionText)
	{
		text = questionText;
	}

	public String getText()
	{
		return text;
	}

	/*
		Sets the answer for this question.
		@param correctResponse the answer
	*/
	public void setAnswer(String correctResponse)
	{
		answer = correctResponse;
	}

	public String getAnswer()
	{
		return answer;
	}

	/*
		Checks a given response for correctness.
		@param response the response to check.
		@return true if the reponse was correct, false otherwise
	*/
	public boolean checkAnswer(String response)
	{
		return response.equals(answer);
	}

	/*
		Displays this question.
	*/
	public void display()
	{
		System.out.println(text);
	}		

	/**
	 * Overrides the toString method from the Object class 
	 * @param
	 * @return a String containing info about the state (all the fields) of the instance
	 */
	@Override
	public String toString()
	{
		return text + " " + answer;
	}

}