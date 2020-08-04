//JUST DRAG AND DROP IN JUDGE (Java code)
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int num = 1;
        for (int i = 1; i <=n ; i++) {
            num = num*i;
        }
        System.out.println(num);
    }
}