import java.util.ArrayList;

public class SubsetGenerator
{
    public static void main(String[] args)
    {
        ArrayList<String> subsets = getSubsets("meat");
        // ArrayList<String> subsets = new ArrayList<String>();

        for (int i = 0; i < subsets.size(); i++)
        {
            System.out.printf("%d: %s\n", i+1, subsets.get(i));
        }
    }

    public static ArrayList<String> getSubsets(String text)
    {
        ArrayList<String> result = new ArrayList<String>();
        if (text.length() == 0)
        {
            result.add(text);
            return result;
        }
        else
        {
            char first = text.charAt(0);
            String shorter = text.substring(1);
            ArrayList<String> shortSubsets = getSubsets(shorter);

            for (String s : shortSubsets)
            {
                result.add(first + s);
            }

            for (String s: shortSubsets)
            {
                result.add(s);
            }
        }
        return result;
    }
}