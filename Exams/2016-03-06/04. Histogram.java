//JUST DRAG THE FILE IN JUDGE (Java code)
import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int p1=0;
        int p2=0;
        int p3=0;
        int p4=0;
        int p5=0;
        for (int i = 1; i < n+1; i++) {
            int num = Integer.parseInt(console.nextLine());
            if (num<200) {
                p1+=1;
            } else if (num>=200 && num <=399) {
                p2+=1;
            } else if (num>=400 && num <=599){
                p3+=1;
            } else if (num>=600 && num<=799) {
                p4+=1;
            } else {
                p5+=1;
            }
        }
        int p = p1+p2+p3+p4+p5;
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n",(double)p1*100/p,(double)p2*100/p,(double)p3*100/p,(double)p4*100/p,(double)p5*100/p);
    }
}