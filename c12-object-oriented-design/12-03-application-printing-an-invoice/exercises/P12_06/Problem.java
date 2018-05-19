/*
Describes a problem
*/
public class Problem
{
    private int[] numbers;
    private String operator;

    public Problem(int[] numbers, String operator)
    {
        this.numbers = numbers;
        this.operator = operator;
    }

    public String toString()
    {
        // String out = String.format("%d %s %d = ?", numbers[0], operator, numbers[1]);
        // TODO: generalize this
        return out;
    }
}