// import java.util.Scanner;

/*
Describes a problem
*/
public class Problem
{
    private int[] operands;
    private String operator;
    private int userAnswer;
    private int solution;
    private int numberOfTries;

    /**
     * Constructs a problem
     * @param operands the array of operands
     * @param operator the string representing an operator
     */
    public Problem(int[] operands, String operator)
    {
        this.operands = operands;
        this.operator = operator;
        // Just set userAnswer to an arbitrary value for now
        this.userAnswer = 0;

        if (this.operator.equals("+"))
            this.solution = this.operands[0] + this.operands[1];
        else if (this.operator.equals("-"))
            this.solution = this.operands[0] - this.operands[1];

        this.numberOfTries = 0;
    }

    /**
     * Gets an array containing the operands
     * @return the array
     */
    public int[] getOperands() { return operands; }

    /**
     * Gets the userAnswer
     */
    public int getUserAnswer() { return userAnswer; }

    /**
     * Gets user input from the console and sets userAnswer's value
     */
    // public void getInput()
    // {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter your answer: ");
    //     userAnswer = sc.nextInt();
    //     sc.close();
    // }

    /**
     * Gets the solution
     * @return the solution
     */
    public int getSolution() { return solution; }

    /**
     * Gets the number of tries
     * @return the number of tries
     */
    public int getNumberOfTries() { return numberOfTries; }

    /**
     * Checks the user answer; if incorrect, update number of tries.
     * @param userAnswer the passed in user answer
     */
    public void checkUserAnswer(int userAnswer)
    {
        this.userAnswer = userAnswer;
        if (!this.isAnswerCorrect())
            this.updateNumberOfTries();
    }

    /**
     * Checks the correctness of user's answer
     */
    public boolean isAnswerCorrect()
    {
        boolean result = false;
        if (userAnswer == solution) 
            result = true;
        return result;
    }

    /**
     * Updates number of tries after a user answer is checked
     */
    public void updateNumberOfTries() { numberOfTries++; }

    /**
     * Formats a Problem to display at the view
     */
    public String format()
    {
        String out = String.format("%d %s %d = ", operands[0], operator, operands[1]);
        return out;
    }

    /**
     * Gets a string representing the state of a Problem
     * @return the string
     */
    public String toString()
    {
        String out = String.format("%d %s %d = ?", operands[0], operator, operands[1]);
        out += "\nuserAnswer: " + userAnswer;
        out += "\nsolution: " + solution;
        out += "\nnumberOfTries: " + numberOfTries;
        return out;
    }
}