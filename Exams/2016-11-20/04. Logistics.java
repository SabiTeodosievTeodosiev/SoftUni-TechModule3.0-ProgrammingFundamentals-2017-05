import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int n = Integer.parseInt(console.nextLine());
        int sum = 0;
        int microbus = 0;
        int truck = 0;
        int train = 0;
        for (int i = 0; i < n; i++) {
            int dailyLoad = Integer.parseInt(console.nextLine());
            if (dailyLoad<=3) {
                sum+=dailyLoad*200;
                microbus+=dailyLoad;
            } else if (dailyLoad>3 && dailyLoad<12) {
                sum+=dailyLoad*175;
                truck+=dailyLoad;
            } else {
                sum+=dailyLoad*120;
                train+=dailyLoad;
            }
        }
        double load = microbus+truck+train;
        System.out.printf("%.2f%n",(double)sum/load);
        System.out.printf("%.2f%%%n",microbus*100/load);
        System.out.printf("%.2f%%%n",truck*100/load);
        System.out.printf("%.2f%%%n",train*100/load);
    }
}