//JUST DRAG AND DROP IN JUDGE (Java code)
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = 0;
        for (;;) {
            try {
                n = Integer.parseInt(console.nextLine());
                if (n%2==0) {
                    System.out.println("Even number entered: " + n);
                    break;
                } else {
                    System.out.println("The number is not even.");
                }
            } catch (Exception e) {
                System.out.println("Invalid number!");
            }
        }
    }
}