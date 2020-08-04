//JUST DRAG AND DROP IN JUDGE (Java code)
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int row = 0;
        int column = 0;
        int num = 0;
        for (int i = 0; i <n ; i++) {
			row = i;
            for (int j = 0; j <n ; j++) {
				column = j;
                num = row + column + 1;
                if (num<=n){
                System.out.print(num + " ");
            } else {
                System.out.print(2*n-num + " ");
                }
                column+=1;
            }
            System.out.println();
            row+=1;
        }
    }
}