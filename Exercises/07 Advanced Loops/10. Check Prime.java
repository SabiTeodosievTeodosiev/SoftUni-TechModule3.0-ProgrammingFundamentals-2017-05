//JUST DRAG AND DROP IN JUDGE (Java code)
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        if (n<2) {
            System.out.println("Not prime");
        } else {
            String type = "Prime";
            for (int i = 2; i <= (int)Math.sqrt(n); i++) {
                if (n%i==0) {
                    type = "Not Prime";
                    System.out.println(type);
                    return;
                }
            }
            System.out.println(type);
        }
    }
}