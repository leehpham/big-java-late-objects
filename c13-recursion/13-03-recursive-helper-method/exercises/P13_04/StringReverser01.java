public class StringReverser01
{
    public static void main(String[] args)
    {
        System.out.println(reverse("My name is Hoang Pham!"));
    }

    public static String reverse(String text)
    {
        return reverse(text, 0, text.length() - 1);
    }

    public static String reverse(String text, int start, int end)
    {
        if (start == end) { return text.substring(start, end + 1); }
        else
        {
            char first = text.charAt(start);
            return reverse(text, start + 1, end) + first;
        }
    }
}