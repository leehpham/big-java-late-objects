using System;

namespace PrintTriangle
{
    class Program
    {
        static void Main(string[] args)
        {
            PrintTriangle(5);
        }

        public static void PrintTriangle(int sideLength)
        {
            if (sideLength < 1) { return; }
            PrintTriangle(sideLength - 1);
            for (int i = 0; i < sideLength; i++)
            {
                Console.Write("[]");
            }
            Console.WriteLine();
        }
    }
}
