//JUST DRAG THE FILE IN JUDGE (Java code)
import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstNum = Integer.parseInt(console.nextLine());
        int secondNum = Integer.parseInt(console.nextLine());
        int thirdNum = Integer.parseInt(console.nextLine());
        int sum = firstNum + secondNum + thirdNum;
        int minutes = sum / 60;
        int seconds = sum % 60;
        if (seconds <10) {
            System.out.println(minutes + ":0" + seconds);
        } else {
            System.out.println(minutes + ":" + seconds);
        }
    }
}