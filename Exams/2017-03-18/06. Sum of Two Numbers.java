import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int firstNum = Integer.parseInt(console.nextLine());
        int secondNum = Integer.parseInt(console.nextLine());
        int magicNum = Integer.parseInt(console.nextLine());
        int iteration = 0;
        for (int i = firstNum; i <= secondNum ; i++) {
            for (int j = firstNum; j <=secondNum ; j++) {
                if (i+j==magicNum){
                    iteration++;
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", iteration, i, j, magicNum);
                    return;
                } else if (i==secondNum && j==secondNum && i+j!=magicNum){
                    iteration++;
                    System.out.printf("%d combinations - neither equals %d%n", iteration, magicNum);
                } else {
                    iteration++;
                }
            }
        }
    }
}