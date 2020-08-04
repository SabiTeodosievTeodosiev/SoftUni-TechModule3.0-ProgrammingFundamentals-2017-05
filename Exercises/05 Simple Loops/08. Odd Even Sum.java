//JUST DRAG AND DROP IN JUDGE (Java code)
import java.util.Scanner; 

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int oddSum = 0;
        int evenSum = 0;
        for (int k=1; k<=n; k++){
            int num = Integer.parseInt(console.nextLine());
            if (k%2 == 1) {
                oddSum += num;
            } else {
                evenSum += num;
            }
        }
        if (oddSum==evenSum) {
            System.out.println("Yes");
            System.out.println("Sum = " + oddSum);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(oddSum-evenSum));
        }
    }
}