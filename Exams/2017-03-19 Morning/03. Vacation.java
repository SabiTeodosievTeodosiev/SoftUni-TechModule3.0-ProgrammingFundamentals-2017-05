import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = Double.parseDouble(console.nextLine());
        boolean isSummer = "Summer".equals(console.nextLine());
        if (budget<=1000){
            if (isSummer){
                System.out.printf("Alaska - Camp - %.2f%n",0.65*budget);
            } else {
                System.out.printf("Morocco - Camp - %.2f%n",0.45*budget);
            }
        } else if (budget>1000 && budget <= 3000) {
            if (isSummer){
                System.out.printf("Alaska - Hut - %.2f%n",0.8*budget);
            } else {
                System.out.printf("Morocco - Hut - %.2f%n",0.6*budget);
            }
        } else {
            if (isSummer){
                System.out.printf("Alaska - Hotel - %.2f%n",0.9*budget);
            } else {
                System.out.printf("Morocco - Hotel - %.2f%n",0.9*budget);
            }
        }
    }
}