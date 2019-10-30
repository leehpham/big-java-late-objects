using System;

/// <summary>
/// This class contains utility methods for array manipulation
/// </summary>
public class ArrayUtil
{
    private static Random generator = new Random();

    /// <summary>
    /// Creates an array filled with random values
    /// </summary>
    /// <param name="lenght">The length of the array.</param>
    /// <param name="n">The number of possible random values</param>
    /// <returns>an array filled with lenght numbers between 0 and n - 1</returns>
    public static int[] RandomIntArray(int length, int n)
    {
        int[] a = new int[length];
        for (int i = 0; i < a.Length; i++)
        {
            a[i] = generator.Next(n);
        }

        return a;
    }

    /// <summary>
    /// Swaps two entries of an array.
    /// </summary>
    /// <param name="a">The array</param>
    /// <param name="i">The first postion to swap</param>
    /// <param name="j">The second position to swap</param>
    public static void Swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}