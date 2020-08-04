//JUST DRAG THE FILE IN JUDGE (C# code)
using System;

public class Program
{
    static void Main()
    {
        var examHour = int.Parse(Console.ReadLine());
        var examMinutes = int.Parse(Console.ReadLine());
        var arrivalHour = int.Parse(Console.ReadLine());
        var arrivalMinutes = int.Parse(Console.ReadLine());
        var examDate = DateTime.Parse($"{examHour}:{examMinutes}");
        var arrivalDate = DateTime.Parse($"{examHour}:{examMinutes}");
        var minutesDifference = arrivalMinutes - examMinutes;
        var hourDifference = arrivalHour - examHour;
        var totalMinutesDiff = hourDifference * 60 + minutesDifference;

        if (totalMinutesDiff == 0)
        {
            Console.WriteLine("On time");
            return;
        } else if (totalMinutesDiff > 0)
        {
            Console.WriteLine("Late");
            if ( totalMinutesDiff < 60)
                Console.WriteLine($"{totalMinutesDiff} minutes after the start");
            else if (totalMinutesDiff >= 60)
            {
                var hours = totalMinutesDiff / 60;
                var minutes = totalMinutesDiff - hours * 60;
                Console.WriteLine($"{hours}:{minutes:D2} hours after the start");
            }
        }
        else if (totalMinutesDiff >= -30 && totalMinutesDiff < 0)
        {
            Console.WriteLine("On time");

        } 
        else if (totalMinutesDiff < -30)
        {
            Console.WriteLine("Early");

        }

        if (totalMinutesDiff > -60 && totalMinutesDiff < 0)
            Console.WriteLine($"{-totalMinutesDiff} minutes before the start");
        else if (totalMinutesDiff <= -60)
        {
            var hours = -totalMinutesDiff / 60;
            var minutes = -totalMinutesDiff - hours * 60;
            Console.WriteLine($"{hours}:{minutes:D2} hours before the start");
        }
    }
}