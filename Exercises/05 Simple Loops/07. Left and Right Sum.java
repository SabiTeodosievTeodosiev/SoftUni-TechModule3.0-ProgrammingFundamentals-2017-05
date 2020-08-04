//JUST DRAG AND DROP IN JUDGE (Java code)
import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int leftSum = 0;
        int rightSum = 0;
        for (int k = 1; k<=n; k++){
            int leftNum = Integer.parseInt(console.nextLine());
            leftSum += leftNum;
        }
        for (int k = 1; k<=n; k++){
            int rightNum = Integer.parseInt(console.nextLine());
            rightSum += rightNum;
        }
        if (leftSum == rightSum) {
            System.out.println("Yes, sum = " + leftSum);
        } else {
            System.out.println("No, diff= " + Math.abs(leftSum-rightSum));
        }
    }
}