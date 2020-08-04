//JUST DRAG THE FILE IN JUDGE (C# code)
using System;

public class Program
{
    static void Main()
    {
        var input = double.Parse(Console.ReadLine());
        var inputType = Console.ReadLine();
        var outputType = Console.ReadLine();
        var outputInM = 0d;
        var output = 0d;

        switch (inputType)
        {
            case "m":
                outputInM = input;
                break;
            case "mm":
                outputInM = input / 1000;
                break;
            case "cm":
                outputInM = input / 100;
                break;
            case "mi":
                outputInM = input / 0.000621371192;
                break;
            case "in":
                outputInM = input / 39.3700787;
                break;
            case "km":
                outputInM = input / 0.001;
                break;
            case "ft":
                outputInM = input / 3.2808399;
                break;
            case "yd":
                outputInM = input / 1.0936133;
                break;
        }

        switch (outputType)
        {
            case "m":
                output = outputInM;
                break;
            case "mm":
                output = outputInM * 1000;
                break;
            case "cm":
                output = outputInM * 100;
                break;             
            case "mi":             
                output = outputInM * 0.000621371192;
                break;             
            case "in":             
                output = outputInM * 39.3700787;
                break;             
            case "km":             
                output = outputInM * 0.001;
                break;             
            case "ft":             
                output = outputInM * 3.2808399;
                break;             
            case "yd":             
                output = outputInM * 1.0936133;
                break;
        }

        Console.WriteLine($"{output} {outputType}");
    }
}