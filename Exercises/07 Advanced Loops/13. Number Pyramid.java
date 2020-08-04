//JUST DRAG AND DROP IN JUDGE (Java code)
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int count = 0;
        for (int i = 1;; i++) {
            for (int j = 1; j <=i ; j++) {
                count++;
                if (count <= n) {
                    System.out.print(count + " ");
                } else {
                    return;
                }
            }
            System.out.println();
        }
    }
}