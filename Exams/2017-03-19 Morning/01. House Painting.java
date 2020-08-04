import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        double x = Double.parseDouble(console.nextLine());
        double y = Double.parseDouble(console.nextLine());
        double h = Double.parseDouble(console.nextLine());

        double greenArea = x*x*2+2*x*y-6.9d;
        double redArea = 2*x*(y+h/2);

        System.out.printf("%.2f%n%.2f%n",greenArea/3.4d,redArea/4.3d);
    }
}