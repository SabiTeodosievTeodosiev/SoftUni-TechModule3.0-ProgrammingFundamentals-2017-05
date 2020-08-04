import java.util.Scanner;

public class MaxCombination {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int start = Integer.parseInt(console.nextLine());
        int end = Integer.parseInt(console.nextLine());
        int maxCombiations = Integer.parseInt(console.nextLine());
        int counter = 0;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                if (counter == maxCombiations) {
                    return;
                }
                System.out.printf("<%d-%d>",i,j);
                counter++;
            }

        }
    }
}