import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchDemo
{
    public static void main(String[] args)
    {
        int[] a = ArrayUtil.randomIntArray(20, 100);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Scanner in = new Scanner(System.in);
        boolean done = false;
        while (!done)
        {
            System.out.print("Enter number to search for, -1 to quit: ");
            int n = in.nextInt();
            if (n == -1)
            {
                done = true;
            }
            else
            {
                int pos = BinarySearcher.search(a, 0, a.length -1 , n);
                System.out.println("Found in position: " + pos);
            }
        }
    }
}