import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int chrysanthemumCount = Integer.parseInt(console.nextLine());
        int roseCount = Integer.parseInt(console.nextLine());
        int tulipCount = Integer.parseInt(console.nextLine());
        String season = console.nextLine();
        String holiday = console.nextLine();

        double sum = 0d;

        if ("Spring".equals(season) || "Summer".equals(season)) {
            sum = chrysanthemumCount * 2.00d + roseCount * 4.10d + tulipCount * 2.50d;
            if ("Y".equals(holiday)) {
            sum*=1.15d;
            }
            if (tulipCount>7 && "Spring".equals(season)){
                sum*=0.95d;
            }
            if(chrysanthemumCount+roseCount+tulipCount>20){
                sum*=0.80d;
            }
            sum+=2;
            System.out.printf("%.2f",sum);
        }
        sum=0d;
        if ("Autumn".equals(season) || "Winter".equals(season)) {
            sum = chrysanthemumCount * 3.75d + roseCount * 4.50d + tulipCount * 4.15d;
            if ("Y".equals(holiday)) {
                sum*=1.15d;
            }
            if(roseCount>=10 && "Winter".equals(season)){
                sum*=0.90d;
            }
            if(chrysanthemumCount+roseCount+tulipCount>20){
                sum*=0.80d;
            }
            sum+=2;
            System.out.printf("%.2f%n",sum);
        }
    }
}