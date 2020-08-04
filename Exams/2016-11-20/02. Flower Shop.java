import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        short magnolii = Short.parseShort(console.nextLine());
        short zumbuli = Short.parseShort(console.nextLine());
        short roses = Short.parseShort(console.nextLine());
        short cactuses = Short.parseShort(console.nextLine());
        double giftPrice = Double.parseDouble(console.nextLine());
        double diff = (magnolii*3.25+zumbuli*4.0+roses*3.50+cactuses*8.0)*0.95-giftPrice;
        if (diff>=0) {
            System.out.printf("She is left with %d leva.%n", (int)Math.floor(diff));
        } else {
            System.out.printf("She will have to borrow %d leva.", (int)Math.ceil(-diff));
        }
    }
}