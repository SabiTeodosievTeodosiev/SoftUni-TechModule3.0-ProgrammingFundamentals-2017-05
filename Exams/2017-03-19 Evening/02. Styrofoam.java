import java.util.Scanner;

public class Styrofoam {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = Double.parseDouble(console.nextLine());
        double area = Double.parseDouble(console.nextLine());
        int windowsCount = Integer.parseInt(console.nextLine());
        double styrofoamAreaPerPacket = Double.parseDouble(console.nextLine());
        double priceStyrofoam = Double.parseDouble(console.nextLine());

        double totalArea = (area-windowsCount*2.4)*1.1/styrofoamAreaPerPacket;
        int packets = (int)Math.ceil(totalArea);
        double totalPrice = packets*priceStyrofoam;
        if (totalPrice<budget){
            System.out.printf("Spent: %.2f%n", totalPrice);
            System.out.printf("Left: %.2f%n", budget-totalPrice);
        } else {
            System.out.printf("Need more: %.2f%n", totalPrice-budget);
        }
    }
}