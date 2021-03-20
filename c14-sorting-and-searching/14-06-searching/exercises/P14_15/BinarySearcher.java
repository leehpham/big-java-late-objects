public class BinarySearcher
{
    public static int search(int[] a, int low, int high, int value)
    {
        if (low <= high)
        {
            int mid = (low + high) / 2;
            if (value == a[mid])
            {
                return mid;
            }
            else if (value < a[mid])
            {
                return search(a, low, mid - 1, value);
            }
            else
            {
                return search(a, mid + 1, high, value);
            }
        }
        else
        {
            return -low - 1;
        }
    }
}