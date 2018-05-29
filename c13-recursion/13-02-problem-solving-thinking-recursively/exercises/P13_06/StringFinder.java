public class StringFinder
{
    public static void main(String[] args)
    {
        System.out.println(find("Hoang Pham", "ha"));
    }

    public static boolean find(String text, String str)
    {
        if (text.length() == str.length())
        {
            if (text.equals(str)) { return true; }
            else { return false; }
        }
        else 
        {
            int strLength = str.length();
            // Get the substring in the beginning of the text
            String firstSubString = text.substring(0, strLength);
            if (firstSubString.equals(str))
                return true;
            else
            {
                String shorter = text.substring(1);
                return find(shorter, str);
            }
        }
    }
}