import com.sun.org.apache.xpath.internal.SourceTree;
import java.util.Scanner;

public class Cups {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int teacups = Integer.parseInt(console.nextLine());
        int workers = Integer.parseInt(console.nextLine());
        int days = Integer.parseInt(console.nextLine());

        int totalTeacups = (int)Math.floor(workers*days*1.6d);
        int diff = totalTeacups-teacups;
        if (diff>=0) {
            System.out.printf("%.2f extra money%n",diff*4.2);
        } else {
            System.out.printf("Losses: %.2f%n",-diff*4.2);
        }
    }
}