public class StringReverser
{
    public static void main(String[] args)
    {
        System.out.println(reverse("My name is Hoang Pham"));
    }

    public static String reverse(String text)
    {
        if (text.length() == 1) { return text; }
        else
        {
            // Get the first character
            String first = text.substring(0, 1);
            // Get the shorter string
            String shorter = text.substring(1);
            return reverse(shorter) + first;
        }
    }
}