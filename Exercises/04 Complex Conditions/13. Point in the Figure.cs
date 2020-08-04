//JUST DRAG AND DROP IN JUDGE (C# code)
using System;

public class Program
{
    static void Main()
    {
        var h = int.Parse(Console.ReadLine());
        var x = int.Parse(Console.ReadLine());
        var y = int.Parse(Console.ReadLine());
        if (((y == 0 && x >= 0 && x <= 3 * h) || (y == h && ((x >= 0 && x <= h) || (x >= 2*h && x <= 3*h) || (y == 4*h && (x >= h && x <= 2*h))))) || (((x == 0 || x == 3*h) && y >= 0 && y <= h) || ((x == h || x == 2*h) && (y >= h && y <= 4*h))) || (y == 4 * h && x >= h && x <= 2 * h)) //add vertical lines
            Console.WriteLine("border");
        else if (((x > 0 && x < 3*h) && (y > 0 && y < h)) || (x > h && x < 2*h && y > h && y < 4*h) || (y == h && x > h && x < 2*h))
            Console.WriteLine("inside");
        else
            Console.WriteLine("outside");
    }
}