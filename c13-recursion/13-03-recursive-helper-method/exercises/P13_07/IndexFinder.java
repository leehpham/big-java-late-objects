public class IndexFinder 
{
    public static void main(String[] args)
    {
        System.out.println(indexOf("My name is Hoang Pham", "am", 0));        
    }

    public static int indexOf(String text, String str)
    {
        return indexOf(text, str, 0);
    }

    public static int indexOf(String text, String str, int start)
    {
        int targetStringLength = str.length();
        if (text.substring(start, text.length()).length() == targetStringLength)
        {
            if (text.substring(start, text.length()).equals(str)) { return start; }
            else { return -1; }
        }
        else
        {
            if (text.substring(start, start + targetStringLength).equals(str)) { return start; }
            else { return indexOf(text, str, start + 1); }            
        }
    }
}