//FOR JUDGE DRAG AND DROP JAVA FILE (Java code)
import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        double budget = Double.parseDouble(console.nextLine());
        String season = console.nextLine();
        if (budget<=100){
            System.out.println("Somewhere in Bulgaria");
            if ("summer".equals(season)){
                System.out.printf("Camp - %.2f%n", 0.3*budget);
            } else if ("winter".equals(season)) {
                System.out.printf("Hotel - %.2f%n", 0.7*budget);
            }
        } else if (budget>100 && budget <=1000) {
            System.out.println("Somewhere in Balkans");
            if ("summer".equals(season)){
                System.out.printf("Camp - %.2f%n", 0.4*budget);
            } else if ("winter".equals(season)) {
                System.out.printf("Hotel - %.2f%n", 0.8*budget);
            }
        } else {
            System.out.println("Somewhere in Europe");
            System.out.printf("Hotel - %.2f%n",0.9*budget);
        }
    }
}