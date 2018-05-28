public class PalindromeChecker
{
    public static void main(String[] args)
    {
        String input = "!madam@";
        System.out.println(isPalindrome(input));
    }

    /**
     * Tests whether a text is a palindrome
     * @param text a string that is being checked
     * @return true if text is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String text)
    {
        // Get the length of text
        int length = text.length();
        // Separate case for shortest strings
        if (length <= 1) { return true; }
        else
        {
            // Get first and last characters, converted to lowercase.
            char first = Character.toLowerCase(text.charAt(0));
            char last = Character.toLowerCase(text.charAt(length - 1));
            
            // If the first character is not a letter
            if (!Character.isLetter(first))
            {
                // Remove it
                String shorter = text.substring(1);
                // Do the check recursively
                return isPalindrome(shorter);
            }
            // If the last character is not a letter
            else if (!Character.isLetter(last)) 
            {
                // Remove it
                String shorter = text.substring(0, length-1);
                // Do the check recursively
                return isPalindrome(shorter);
            }
            // If the first and last characters are letters
            else if (Character.isLetter(first) && Character.isLetter(last))
            {
                // If they are the same
                if (first == last)
                {
                    // Remove both first and last character
                    String shorter = text.substring(1, length - 1);
                    // Do the check recursively
                    return isPalindrome(shorter);
                }
                else
                {
                    return false;
                }
            }
            else 
            {
                return false;
            }
        }
    }
}