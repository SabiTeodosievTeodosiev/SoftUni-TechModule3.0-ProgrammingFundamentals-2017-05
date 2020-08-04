import java.util.Scanner;

public class TwoNumbersSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int first = Integer.parseInt(console.nextLine());
        int second = Integer.parseInt(console.nextLine());
        int magical = Integer.parseInt(console.nextLine());
        int iterations = 0;
        for (int i = first; i >= second; i--) {
            for (int j = first; j >= second ; j--) {
                iterations++;
                if(i+j==magical) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n",iterations,i,j,magical);
                    return;
                } else if (i+j!=magical && i==second && j==second){
                    System.out.printf("%d combinations - neither equals %d%n",iterations,magical);
                }
            }
        }
    }
}