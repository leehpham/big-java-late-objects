import java.util.ArrayList;
import java.util.Scanner;

public class RecursiveFib
{
    public static void main(String[] args)
    {
        ArrayList<Long> computedValues = new ArrayList<Long>();
        computedValues.add(0L);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++)
        {
            System.out.printf("fib(%d) = %d\n", i, fib(i, computedValues));
        }
        in.close();
    }

    public static long fib(int n, ArrayList<Long> computedValues)
    {
        if (n < computedValues.size())
        {
            return computedValues.get(n);
        }
        if (n <= 2)
        {
            computedValues.add(1L);
            return 1;
        }
        else
        {
            long f = fib(n - 1, computedValues) + fib(n - 2, computedValues);
            computedValues.add(f);
            return f;
        }
    }
}