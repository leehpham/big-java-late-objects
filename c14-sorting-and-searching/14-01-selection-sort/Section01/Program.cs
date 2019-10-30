using System;

namespace Section01
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] a = ArrayUtil.RandomIntArray(20, 100);
            Console.WriteLine(string.Join(",", a));

            SelectionSorter.Sort(a);

            Console.WriteLine(string.Join(",", a));
        }
    }
}
