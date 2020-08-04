//JUST DRAG THE FILE IN JUDGE (Java code)
import java.util.Scanner;

public class StartUp {

    public static void main(String[] args) {
        //while (true)
        PrintNumInWords();
    }

    private static void PrintNumInWords() {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();

        Short num = -1;
        try {
            num = Short.parseShort(input);
            if (num < 0 || num > 100) {
                InvalidNumberError();
                return;
            }
        } catch (Exception ex) {
            InvalidNumberError();
            return;
        }

        if ("100".equals(input))
            Print("one hundred");
        else if (input.length() == 1) {
            if (num == 0)
                Print("zero");
            else if (num == 1)
                Print("one");
            else if (num == 2)
                Print("two");
            else if (num == 3)
                Print("three");
            else if (num == 4)
                Print("four");
            else if (num == 5)
                Print("five");
            else if (num == 6)
                Print("six");
            else if (num == 7)
                Print("seven");
            else if (num == 8)
                Print("eight");
            else if (num == 9)
                Print("nine");
        } else if (num == 10)
            Print("ten");
        else if (num == 11)
            Print("eleven");
        else if (num == 12)
            Print("twelve");
        else if (num == 13)
            Print("thirteen");
        else if (num == 14)
            Print("fourteen");
        else if (num == 15)
            Print("fifteen");
        else if (num == 16)
            Print("sixteen");
        else if (num == 17)
            Print("seventeen");
        else if (num == 18)
            Print("eighteen");
        else if (num == 19)
            Print("nineteen");
        else {
            Character firstDigit = input.charAt(0);
            Character secondDigit = input.charAt(1);
            String output = "";

            switch (firstDigit) {
                case '2':
                    output = "twenty";
                    break;
                case '3':
                    output = "thirty";
                    break;
                case '4':
                    output = "forty";
                    break;
                case '5':
                    output = "fifty";
                    break;
                case '6':
                    output = "sixty";
                    break;
                case '7':
                    output = "seventy";
                    break;
                case '8':
                    output = "eighty";
                    break;
                case '9':
                    output = "ninety";
                    break;
            }

            switch (secondDigit) {
                case '1':
                    output += " one";
                    break;
                case '2':
                    output += " two";
                    break;
                case '3':
                    output += " three";
                    break;
                case '4':
                    output += " four";
                    break;
                case '5':
                    output += " five";
                    break;
                case '6':
                    output += " six";
                    break;
                case '7':
                    output += " seven";
                    break;
                case '8':
                    output += " eight";
                    break;
                case '9':
                    output += " nine";
                    break;
            }

            Print(output);
        }
    }

    public static void Print(String output) {
        System.out.println(output);
        return;
    }

    private static void InvalidNumberError() {
        Print("invalid number");
        return;
    }
}