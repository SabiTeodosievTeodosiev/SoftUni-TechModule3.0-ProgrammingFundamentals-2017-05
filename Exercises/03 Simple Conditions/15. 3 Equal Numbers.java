//JUST DRAG THE FILE IN JUDGE (Java code)
import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstNum = Integer.parseInt(console.nextLine());
        int secondNum = Integer.parseInt(console.nextLine());
        int thirdNum = Integer.parseInt(console.nextLine());
        if (firstNum == secondNum) {
            if (secondNum==thirdNum) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        } else {
            System.out.println("no");
        }
    }
}