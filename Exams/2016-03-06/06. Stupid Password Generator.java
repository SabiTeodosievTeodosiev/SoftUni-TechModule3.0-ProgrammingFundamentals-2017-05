//JUST DRAG THE FILE IN JUDGE (Java code)
import java.util.Scanner;

public class StupidPasswordGenerator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int l = Integer.parseInt(console.nextLine());
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                for (char k = 'a'; k <='a'+l-1 ; k++) {
                    for (char m = 'a'; m <='a'+l-1 ; m++) {
                        for (int o = 1; o <=n ; o++) {
                            if (o>i && o>j) {
                                System.out.printf("%d%d%s%s%d ",i,j,k,m,o);
                            }
                        }
                    }
                }
            }
        }
    }
}