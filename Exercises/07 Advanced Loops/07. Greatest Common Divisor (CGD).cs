//JUST DRAG AND DROP IN JUDGE (C# code)
using System;

public class Program
{
    static void Main()
    {
        var a = int.Parse(Console.ReadLine());
        var b = int.Parse(Console.ReadLine());
        var smallerNum = Math.Min(a, b);
        Console.WriteLine(Gcd(a, b));
    }
    static int Gcd(int a, int b)
    {
        while (a != b)
        {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }
}