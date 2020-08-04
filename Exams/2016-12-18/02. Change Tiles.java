import java.util.Scanner;

public class ChangeTiles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double money = Double.parseDouble(console.nextLine());
        double width = Double.parseDouble(console.nextLine());
        double length = Double.parseDouble(console.nextLine());
        double side = Double.parseDouble(console.nextLine());
        double height = Double.parseDouble(console.nextLine());
        double tilePrice = Double.parseDouble(console.nextLine());
        double sumExpert = Double.parseDouble(console.nextLine());

        double floorArea = width*length;
        double tileArea = side*height/2;
        int tileCount = (int)Math.ceil(floorArea/tileArea)+5;
        double totalSum = tileCount*tilePrice+sumExpert;
        if (totalSum<=money){
            System.out.printf("%.2f lv left.%n",money-totalSum);
        } else {
            System.out.printf("You'll need %.2f lv more.%n",totalSum-money);
        }
    }
}