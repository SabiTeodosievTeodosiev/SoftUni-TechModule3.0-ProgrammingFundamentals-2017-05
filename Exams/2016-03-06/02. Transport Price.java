//JUST DRAG THE FILE IN JUDGE (Java code)
import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int n = Integer.parseInt(console.nextLine());
        String time = console.nextLine();
        if (n<20) {
            if ("day".equals(time)) {
                System.out.println(0.7 + 0.79 * n);
            } else {
				System.out.println(0.7 + 0.9 * n);
            }
        } else if (n>=20 && n<100) {
            System.out.println(0.09*n);
        } else {
            System.out.println(0.06*n);
        }
    }
}