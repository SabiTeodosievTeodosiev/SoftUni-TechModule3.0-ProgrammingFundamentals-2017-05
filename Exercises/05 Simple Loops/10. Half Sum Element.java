//JUST DRAG AND DROP IN JUDGE (Java code)
import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int currNum = Integer.parseInt(console.nextLine());
            sum += currNum;
            if (currNum > max) {
                max = currNum;
            }
        }
        sum = sum - max;
        int diff = Math.abs(sum - max);
        if (diff == 0) {
            System.out.println("Yes");
            System.out.println("Sum = " + sum);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }
    }
}