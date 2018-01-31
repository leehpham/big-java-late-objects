public class FillInQuestion extends Question
{
    @Override
    public void setText(String questionText)
    {
        super.setText(questionText + " ____");
    }

    @Override 
    public void setAnswer(String correctResponse)
    {
        super.setAnswer("_" + correctResponse + "_");
    }

    @Override 
    public boolean checkAnswer(String response)
    {
        String formattedResponse = "_" + response + "_";
        return (formattedResponse.equals(this.getAnswer()));
    }
}