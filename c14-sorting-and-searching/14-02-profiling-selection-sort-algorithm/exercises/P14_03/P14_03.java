import java.util.Arrays;

public class P14_03
{
    public static void main(String[] args)
    {
        int[] array_sizes = new int[] {10000, 20000, 30000, 40000, 50000, 60000};
        StopWatch timer = new StopWatch();
        for (int size: array_sizes)
        {
            int[] a = ArrayUtil.randomIntArray(size, size);

            timer.start();
            SelectionSorter.sort(a);
            long elapsedTime = timer.stop();
            System.out.println(size + " - " + elapsedTime);
        }
    }
}