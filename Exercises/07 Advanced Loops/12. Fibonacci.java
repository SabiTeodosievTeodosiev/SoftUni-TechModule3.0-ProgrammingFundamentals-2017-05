//JUST DRAG AND DROP IN JUDGE (Java code)
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        if (n<2) {
            System.out.println("1");
            return;
        }
        int fN = 1;
        int sN = 1;
        int sum = 1;
        for (int i = 3; i <= n+1; i++) {
            sum=fN+sN;
            fN=sN;
            sN=sum;
        }
        System.out.println(sN);
    }
}