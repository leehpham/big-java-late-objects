using System;

namespace P05_16
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(IsPalindrome("Hoang"));
            Console.WriteLine(IsPalindrome("exxe"));
            Console.WriteLine(IsPalindrome("rotor"));
            Console.WriteLine(IsPalindrome("mm"));
            Console.WriteLine(IsPalindrome("o"));
            Console.WriteLine(IsPalindrome("mn"));
        }

        public static bool IsPalindrome(string str)
        {
            if (str.Length == 1 || (str.Length == 2 && str[0] == str[str.Length - 1]))
            {
                return true;
            }
            else if (str.Length == 2 && str[0] != str[str.Length - 1])
            {
                return false;
            }
            else
            {
                var isPalindrome = IsPalindrome(str.Substring(1, str.Length -2)) && str[0] == str[str.Length - 1];
                return isPalindrome;
            }
        }
    }
}
