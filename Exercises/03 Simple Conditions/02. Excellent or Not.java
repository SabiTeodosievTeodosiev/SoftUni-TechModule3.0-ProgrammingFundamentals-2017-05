//JUST DRAG THE FILE IN JUDGE (Java code)
import java.util.Scanner;

public class ExcellentOrNot {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double grade = Double.parseDouble(console.nextLine());
        if (grade >= 5.5) {
            System.out.println("Excellent!");
        } 
        else {
            System.out.println("Not excellent.");
        }
    }
}