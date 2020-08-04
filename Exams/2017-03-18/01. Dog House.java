import java.util.Scanner;

public class DogHouse {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        double a = Double.parseDouble(console.nextLine());
        double b = Double.parseDouble(console.nextLine());
        double greenArea = a*(b/2+1.21*a);
        double redArea = a*a;
        System.out.printf("%.2f%n%.2f%n",greenArea/3,redArea/5);
    }
}