import java.util.Scanner;
public class SquareOfStars {
public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    int n = Integer.parseInt(console.nextLine());
    for (int i = 1; i <= n; i++) {
        System.out.print("*");
    }
    System.out.println("");
    for (int j=2; j<=n-1; j++ ) {
        System.out.print("*");
        for (int k=2; k<=n-1;k++){
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println("");
    }
    for (int i=1;i<=n;i++){
        System.out.print("*");
    }
    System.out.println("");
    }
}