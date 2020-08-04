//JUST DRAG AND DROP IN JUDGE (Java code)
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int num = 1;
        System.out.println(num);
        for (int i = 1; i < n ; i+=2) {
            num = num * 4;
            System.out.println(num);
        }
    }
}