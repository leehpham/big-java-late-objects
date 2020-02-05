using System;

namespace P05_18
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(CountDigits(1234567890));
            Console.WriteLine(CountDigits(4));
        }

        public static int CountDigits(int n)
        {
            if (n / 10 == 0)
            {
                return 1;
            }
            else
            {
                var digitCount = CountDigits(n / 10) + 1;
                return digitCount;
            }
        }
    }
}
