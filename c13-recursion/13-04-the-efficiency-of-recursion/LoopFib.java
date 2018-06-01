import java.util.Scanner;
public class LoopFib
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++)
        {
            System.out.println("fib(" + i + ") = " + fib(i));
        }
        sc.close();
    }

    public static long fib(int n)
    {
        if (n <= 2) { return 1; }
        else 
        {
            long olderValue = 1;
            long oldValue = 1;
            long newValue = 1;
            for (int i = 3; i <= n; i++)
            {
                newValue = oldValue + olderValue;
                olderValue = oldValue;
                oldValue = newValue;
            }
            return newValue;
        }
    }
}