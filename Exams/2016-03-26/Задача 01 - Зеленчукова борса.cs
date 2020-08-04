//FOR JUDGE DRAG AND DROP CS FILE (C# code)
using System;

public class Program
{
    static void Main(string[] args)
    {
        var n = double.Parse(Console.ReadLine());
        var m = double.Parse(Console.ReadLine());
        var nKg = int.Parse(Console.ReadLine());
        var mKg = int.Parse(Console.ReadLine());
        var output = (n * nKg + m * mKg) / 1.94;
        Console.WriteLine(output);
    }
}