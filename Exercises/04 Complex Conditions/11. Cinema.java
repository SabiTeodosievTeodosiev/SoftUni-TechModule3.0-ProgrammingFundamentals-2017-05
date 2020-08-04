//JUST DRAG AND DROP IN JUDGE (Java code)
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String vid = console.nextLine().toLowerCase();
        int r = Integer.parseInt(console.nextLine());
        int c = Integer.parseInt(console.nextLine());
        if (vid.equals("premiere")) {
            double result = r*c*12;
            System.out.printf("%.2f leva", result);
        } else if (vid.equals("normal")) {
            double result = r*c*7.5;
            System.out.printf("%.2f leva", result);
        } else if (vid.equals("discount")) {
            double result = r*c*5;
            System.out.printf("%.2f leva", result);
        }
    }
}