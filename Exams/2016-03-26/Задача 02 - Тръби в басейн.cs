//FOR JUDGE DRAG AND DROP CS FILE (C# code)
using System;

public class Program
{
    static void Main()
    {
        var v = int.Parse(Console.ReadLine());
        var p1 = int.Parse(Console.ReadLine());
        var p2 = int.Parse(Console.ReadLine());
        var h = double.Parse(Console.ReadLine());
        var totalVol = (p1 + p2) * h;
        if (totalVol <= v)
        {
            Console.WriteLine("The pool is {0}% full. Pipe 1: {1}%. Pipe 2: {2}%.", Math.Truncate(totalVol / v * 100), Math.Truncate(100.0 * p1 / (p1 + p2)), Math.Truncate(100.0 * p2 / (p1 + p2)));
        }
        else
        {
            Console.WriteLine($"For {h} hours the pool overflows with {(totalVol - v):F1} liters.");
        }
    }
}