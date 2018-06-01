public class StringReverser01
{
    public static void main(String[] args)
    {
        System.out.println(reverse("My name is Hoang Pham!"));
    }

    public static String reverse(String text)
    {
        String str = "";
        for (int i = text.length() - 1; i >= 0; i--)
        {
            str += text.charAt(i);
        }
        return str;
    }
}