import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int v0 = Integer.parseInt(console.nextLine());
        int t1 = Integer.parseInt(console.nextLine());
        int t2 = Integer.parseInt(console.nextLine());
        int t3 = Integer.parseInt(console.nextLine());
        double t1Min = t1/60.00;
        double t2Min = t2/60.00;
        double t3Min = t3/60.00;
        System.out.printf("%.2f%n",v0*(t1Min+1.1*t2Min+1.045*t3Min));
    }
}