//JUST DRAG THE FILE IN JUDGE (Java code)
import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int points = Integer.parseInt(console.nextLine());
        if (points > 1000) {
            double bonus = 0.1* points;
            if (points % 2 == 0) {
                bonus=bonus+1;
            } else if (points % 5 == 0) {
                bonus=bonus+2;
            }
            System.out.println(bonus);
            System.out.println(points+bonus);
        } else if (points <= 100) {
            double bonus = 5;
            if (points % 2 == 0) {
                bonus=bonus+1;
            } else if (points % 5 == 0) {
                bonus=bonus+2;
            }
            System.out.println(bonus);
            System.out.println(points+bonus);
        } else {
            double bonus = points * 0.2;
            if (points % 2 == 0) {
                bonus=bonus+1;
            } else if (points % 5 == 0) {
                bonus=bonus+2;
            }
            System.out.println(bonus);
            System.out.println(points+bonus);
        }
    }
}