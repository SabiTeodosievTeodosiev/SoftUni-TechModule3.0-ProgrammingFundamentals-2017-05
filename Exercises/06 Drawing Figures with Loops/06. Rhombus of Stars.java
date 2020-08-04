//JUST DRAG IN JUDGE (Java code)
import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int row = 1; row <= n; row++) {
            for (int i = n; i > row; i--) {
                System.out.print(" ");
            }
            for (int c = 0; c < row; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = n-1; row > 0; row--) {
            for (int i = n; i > row; i--) {
                System.out.print(" ");
            }
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}