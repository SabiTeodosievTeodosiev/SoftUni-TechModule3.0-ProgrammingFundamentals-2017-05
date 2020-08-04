//JUST DRAG AND DROP IN JUDGE (Java code)
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        for (int i = 1;; i++) {
            int n = Integer.parseInt(console.nextLine());
            if (n>=1 && n<=100){
                System.out.println("The number is: " + n);
                break;

        } else {
                System.out.println("Invalid number!");
            }


        }
    }
}