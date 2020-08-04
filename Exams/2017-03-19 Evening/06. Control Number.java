import java.util.Scanner;

public class ControlNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        byte n = Byte.parseByte(console.nextLine());
        byte m = Byte.parseByte(console.nextLine());
        int control = Integer.parseInt(console.nextLine());
        int sum = 0;
        int iterations = 0;
        for (byte i = 1; i <n+1 ; i++) {
            for (byte j = m; j >0 ; j--) {
                sum+=i*2+j*3;
                iterations +=1;
                if (sum>=control) {
                    System.out.println(iterations+ " moves");
                    System.out.printf("Score: %d >= %d%n", sum, control);
                    return;
                }
                if (i==n && j==1 && sum<control){
                    System.out.println(iterations+ " moves");
                    return;
                }
            }
        }
    }
}