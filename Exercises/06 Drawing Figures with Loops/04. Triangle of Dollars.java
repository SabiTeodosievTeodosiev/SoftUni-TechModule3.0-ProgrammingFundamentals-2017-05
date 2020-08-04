//JUST DRAG IN JUDGE (Java code)
import java.util.Scanner;

public class TriangleOfDollars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}