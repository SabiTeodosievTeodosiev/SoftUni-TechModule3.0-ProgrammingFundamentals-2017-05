//JUST DRAG AND DROP IN JUDGE (Java code)
import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        String visokosna = console.nextLine().toLowerCase();
        int p = Integer.parseInt(console.nextLine());
        int h = Integer.parseInt(console.nextLine());
        double sum = (48-h)*0.75 + p*2/3 + h;
        double bonus = 0.15*sum;
        double newSum = sum+bonus;
        if (visokosna.equals("leap")){
            System.out.printf("%.0f", newSum);
        } else if (visokosna.equals("normal")){
            System.out.printf("%.0f", sum);
        }
    }
}