import java.util.Scanner;

/**
 * Created by Guest Lector on 3/11/2017.
 */
public class Pr02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double floorWidth = Double.parseDouble(scanner.nextLine());
        double floorLength = Double.parseDouble(scanner.nextLine());
        double triangleSide = Double.parseDouble(scanner.nextLine());
        double triangleH = Double.parseDouble(scanner.nextLine());
        double pricePerTile = Double.parseDouble(scanner.nextLine());
        double handyManFee = Double.parseDouble(scanner.nextLine());

        double floorArea = floorWidth * floorLength;
        double triangleArea = triangleSide * triangleH / 2d;
        double neededTiles = Math.ceil(floorArea / triangleArea) + 5d;
        double totalPrice = pricePerTile * neededTiles + handyManFee;

//        double leftCash = budget - totalPrice;
//        if (leftCash >= 0d) {
//            System.out.printf("%.2f lv left.%n", leftCash);
//        } else {
//            System.out.printf("You'll need %.2f lv more.%n", -leftCash);
//        }
        if (budget >= totalPrice) {
            System.out.printf("%.2f lv left.%n", budget - totalPrice);
        } else {
            System.out.printf("You'll need %.2f lv more.%n", totalPrice - budget);
        }
    }
}
