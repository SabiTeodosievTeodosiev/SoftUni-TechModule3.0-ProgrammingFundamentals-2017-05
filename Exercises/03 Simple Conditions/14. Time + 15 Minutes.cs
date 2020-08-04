//JUST DRAG THE FILE IN JUDGE (C# code)
using System;

public class Program
{
    static void Main()
    {
        var time = new DateTime();
        var hour = int.Parse(Console.ReadLine());
        var minutes = int.Parse(Console.ReadLine());
        time = DateTime.Parse($"{hour}:{minutes}");
        var laterTime = time.AddMinutes(15);
        Console.WriteLine($"{laterTime.Hour}:{laterTime.Minute:D2}");
    }
}