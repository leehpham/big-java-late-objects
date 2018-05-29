public class PalindromeChecker01
{
    public static void main(String[] args)
    {
        System.out.println(isPalindrome("!madam@"));
    }

    public static boolean isPalindrome(String text)
    {
        return isPalindrome(text, 0, text.length() - 1);
    }

    /**
     * Tests whether a substring is a palindrome
     * @param text a string that is being checked
     * @param start the index of the first character of the substring
     * @param end the index of the last character of the substring
     * @return true if the substring is a palindrome
     */
    public static boolean isPalindrome(String text, int start, int end)
    {
        // Separate case for substrings of length 0 and 1.
        if (start >= end) { return true; }
        else
        {
            char first = text.charAt(start);
            char last = text.charAt(end);
            if (Character.isLetter(first) && Character.isLetter(last))
            {
                if (first == last)
                {
                    return isPalindrome(text, start + 1, end - 1);
                }
                else
                {
                    return false;
                }
            }
            else if (!Character.isLetter(first))
            {
                return isPalindrome(text, start + 1, end);
            }
            else 
            {
                return isPalindrome(text, start, end - 1);
            }
        }
    }
}