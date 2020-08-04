//JUST DRAG AND DROP IN JUDGE (Java code)
import java.util.Scanner;

public class PointInRectangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());
        double x = Double.parseDouble(console.nextLine());
        double y = Double.parseDouble(console.nextLine());
        if (x<=x2 && x1<=x && y<=y2 && y1<=y) {
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }
    }
}