//JUST DRAG AND DROP IN JUDGE (C# code)
using System;

public class Program
{
    static void Main()
    {
        var x1 = double.Parse(Console.ReadLine());
        var y1 = double.Parse(Console.ReadLine());
        var x2 = double.Parse(Console.ReadLine());
        var y2 = double.Parse(Console.ReadLine());
        var x = double.Parse(Console.ReadLine());
        var y = double.Parse(Console.ReadLine());
        if ((x == x1  || x == x2) && (y <= y2 && y >= y1) || (y == y1 || y == y2) && (x <= x2 && x >= x1))
        {
            Console.WriteLine("Border");
        }
        else
        {
            Console.WriteLine("Inside / Outside");
        }
    }
}