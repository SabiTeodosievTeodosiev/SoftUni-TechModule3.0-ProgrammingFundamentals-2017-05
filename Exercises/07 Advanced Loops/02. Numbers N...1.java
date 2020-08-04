//JUST DRAG AND DROP IN JUDGE (Java code)
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = n; i >= 1 ; i--) {
            System.out.println(i);
        }
    }
}