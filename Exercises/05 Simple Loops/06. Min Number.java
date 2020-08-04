//JUST DRAG AND DROP IN JUDGE (Java code)
import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int maxNum = Integer.MAX_VALUE;
        for (int i = 1; i<=n; i++){
            int k = Integer.parseInt(console.nextLine());
            if (k<maxNum) {
                maxNum = k;
            }
        }
        System.out.println(maxNum);
    }
}