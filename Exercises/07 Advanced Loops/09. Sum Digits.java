//JUST DRAG AND DROP IN JUDGE (Java code)
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        int sum = 0;
        int right = 0;
        do { right = num%10;
            sum += right;
            num = (num - right)/10;
        } while (num!=0);
        System.out.println(sum);
    }
}