//FOR JUDGE DRAG AND DROP JAVA FILE (Java code)
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(console.nextLine());
            if (num%2==0) {
                p1+=1;
            }
            if (num%3==0) {
                p2+=1;
            }
            if (num%4==0) {
                p3+=1;
            }
        }
        System.out.printf("%.2f%%%n",(double)p1*100/n);
        System.out.printf("%.2f%%%n",(double)p2*100/n);
        System.out.printf("%.2f%%%n",(double)p3*100/n);
    }
}