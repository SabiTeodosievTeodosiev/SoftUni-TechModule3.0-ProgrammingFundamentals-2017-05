//JUST DRAG IN JUDGE (Java code)
import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j < n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.print(" | ");
            for (int j = 0; j <i; j++) {
                System.out.print("*");
            }
            System.out.println();
            }
        }
}