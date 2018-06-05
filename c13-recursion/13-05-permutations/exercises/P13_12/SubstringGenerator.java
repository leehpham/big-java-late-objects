import java.util.ArrayList;

public class SubstringGenerator
{
    public static void main(String[] args)
    {
        for (String s : getSubstrings("Hoang"))
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> getSubstrings(String text)
    {
        ArrayList<String> result = new ArrayList<String>();

        if (text.length() == 0)
        {
            result.add(text);
            return result;
        }
        else
        {
            String startWithFirstChar = "";
            for (int i = 1; i <= text.length(); i++)
            {
                startWithFirstChar = text.substring(0, i);
                result.add(startWithFirstChar);
            }
            String shorter = text.substring(1);
            ArrayList<String> shorterSubStrings = getSubstrings(shorter);

            for (String s : shorterSubStrings)
            {
                result.add(s);
            }
        }
        return result;
    } 
}