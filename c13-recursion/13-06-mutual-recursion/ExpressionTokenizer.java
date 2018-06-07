/**
 * This class breaks up a string describing an expression
 * into tokens: numbers, parentheses, and operators.
 */
public class ExpressionTokenizer
{
    /* Instance variable */
    // Declare a String called "input"
    private String input;

    // Declare an int called "start"
    private int start; // The start of the next token

    // Declare an int called "end"
    private int end; // The position after the end of the next token

    /**
     * Constructs a tokenizer
     * @param anInput the string to tokenize
     */
    public ExpressionTokenizer(String anInput)
    {
        // Initialize "input"
        this.input = anInput;
        // Initialize "start"
        this.start = 0;
        // Initialize "end"
        // this.end = 0;
        this.end = 1;        
        // Call nextToken() to find the first token
        // Find the first token
        nextToken();
    }

    /**
     * Peeks at the next token without consuming it.
     * @return the next token or null if there are no more tokens
     */
    public String peekToken()
    {
        // if we are already at the end of the string (there is no next token)
        if (start >= input.length()) { return null; }
        else { return input.substring(start, end); }
    }


    /**
     * Gets the next token and moves the tokenizer to the following token.
     * @return the next token or null if there are no more tokens
     */
    public String nextToken()
    {
        // Call peekToken() and assign the return value to a String called "r"
        String r = peekToken();
        start = end;
        if (start >= input.length()) { return r; }
        if (Character.isDigit(input.charAt(start)))
        {
            end = start + 1;
            while (end < input.length() && Character.isDigit(input.charAt(end)))
            {
                end++;
            }
        }
        else
        {
            end = start + 1;
        }
        return r;
    }
}