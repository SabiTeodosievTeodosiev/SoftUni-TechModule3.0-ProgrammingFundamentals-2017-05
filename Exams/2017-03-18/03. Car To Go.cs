using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

public class Program
{
    static void Main()
    {
        string output = null;
        double budget = double.Parse(Console.ReadLine());
        var season = Console.ReadLine();
        if (budget<=100)
        {
            output += "Economy class\n";
            if (season=="Summer")
            {
                output += $"Cabrio - {0.35*budget:F2}\n";
            }
            if (season=="Winter")
            {
                output += $"Jeep - {0.65 * budget:F2}\n";
            }
        }
        else if (budget>100 && budget <=500)
        {
            output += "Compact class\n";
            if (season == "Summer")
            {
                output += $"Cabrio - {0.45 * budget:F2}\n";
            }
            if (season == "Winter")
            {
                output += $"Jeep - {0.80 * budget:F2}\n";
            }
        }
        else
        {
            output += "Luxury class\n";
                output += $"Jeep - {0.9 * budget:F2}\n";
        }
        Console.WriteLine(output);
    }
}