//JUST DRAG AND DROP IN JUDGE (C# code)
using System;

public class Program
{
    static void Main()
    {
        var n = int.Parse(Console.ReadLine());
        var oddSum = 0d;
        var oddMin = double.MaxValue;
        var oddMax = double.MinValue;
        var evenSum = 0d;
        var evenMin = double.MaxValue;
        var evenMax = double.MinValue;
        for (int i = 1; i <= n; i++)
        {
            var num = double.Parse(Console.ReadLine());
            if (i % 2 == 1)
            {
                oddSum += num;
                if (num < oddMin)
                    oddMin = num;
                if (num > oddMax)
                    oddMax = num;
            }
            else
            {
                evenSum += num;
                if (num < evenMin)
                    evenMin = num;
                if (num > evenMax)
                    evenMax = num;
            }
        }
        Console.WriteLine($"OddSum={oddSum},");
        if (oddMin != double.MaxValue)
            Console.WriteLine($"OddMin={oddMin},");
        else
            Console.WriteLine("OddMin=No,");
        if (oddMax != double.MinValue)
            Console.WriteLine($"OddMax={oddMax},");
        else
            Console.WriteLine("OddMax=No,");
        Console.WriteLine($"EvenSum ={evenSum},");
        if (evenMin != double.MaxValue)
            Console.WriteLine($"EvenMin={evenMin},");
        else
            Console.WriteLine("EvenMin=No,");
        if (evenMax != double.MinValue)
            Console.WriteLine($"EvenMax={evenMax}");
        else
            Console.WriteLine("EvenMax=No");
    }
}