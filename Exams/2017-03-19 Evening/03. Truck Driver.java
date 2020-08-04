import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String season = console.nextLine();
        double kpm = Double.parseDouble(console.nextLine());


        if ("Spring".equals(season) || "Autumn".equals(season)) {
            if (kpm<=5000){
                System.out.printf("%.2f%n",kpm*0.75*3.6);
            } else if (kpm>5000 && kpm<=10000) {
                System.out.printf("%.2f%n",kpm*0.95*3.6);
            } else {
                System.out.printf("%.2f%n",kpm*1.45*3.6);
            }
        }
        if ("Summer".equals(season)) {
            if (kpm<=5000){
                System.out.printf("%.2f%n",kpm*0.90*3.6);
            } else if (kpm>5000 && kpm<=10000) {
                System.out.printf("%.2f%n",kpm*1.10*3.6);
            } else {
                System.out.printf("%.2f%n",kpm*1.45*3.6);
            }
        }
        if ("Winter".equals(season)) {
            if (kpm<=5000){
                System.out.printf("%.2f%n",kpm*1.05*3.6);
            } else if (kpm>5000 && kpm<=10000) {
                System.out.printf("%.2f%n",kpm*1.25*3.6);
            } else {
                System.out.printf("%.2f%n",kpm*1.45*3.6);
            }
        }

    }
}