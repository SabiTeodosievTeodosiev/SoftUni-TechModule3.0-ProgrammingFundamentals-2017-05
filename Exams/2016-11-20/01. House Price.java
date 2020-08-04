import java.util.Scanner;

public class HousePrice {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        double minArea = Double.parseDouble(console.nextLine());
        double kitchenArea = Double.parseDouble(console.nextLine());
        double pricePerMeter = Double.parseDouble(console.nextLine());
        System.out.printf("%.2f%n",(minArea*3.81+kitchenArea)*1.05*pricePerMeter);
    }
}