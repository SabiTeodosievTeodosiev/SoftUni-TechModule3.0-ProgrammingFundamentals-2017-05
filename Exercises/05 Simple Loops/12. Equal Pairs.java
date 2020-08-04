//JUST DRAG AND DROP IN JUDGE (Java code)
import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());
        int sum = a+b;
        int maxDiff=Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            int firstNum = Integer.parseInt(console.nextLine());
            int secondNum = Integer.parseInt(console.nextLine());
            int diff = Math.abs(firstNum+secondNum-sum);
            if (diff>maxDiff){
                maxDiff=diff;
            }
            sum = firstNum + secondNum;
        }

        if (maxDiff==0 || maxDiff==Integer.MIN_VALUE){
            System.out.println("Yes, value=" + sum);
        } else {
            System.out.println("No, maxdiff=" + maxDiff);
        }


    }
}