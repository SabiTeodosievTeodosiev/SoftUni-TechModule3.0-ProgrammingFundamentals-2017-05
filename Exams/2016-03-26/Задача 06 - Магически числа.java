//FOR JUDGE DRAG AND DROP JAVA FILE (Java code)
import java.util.Scanner;

public class MagicalNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = 0; i <10; i++) {
            for (int j = 0; j <10; j++) {
                for (int k = 0; k <10; k++) {
                    for (int l = 0; l <10; l++) {
                        for (int m = 0; m <10; m++) {
                            for (int o = 0; o <10; o++) {
                                if (i*j*k*l*m*o==n) {
                                    System.out.printf("%d%d%d%d%d%d ",i,j,k,l,m,o);
                                }
                            }

                        }

                    }

                }

            }
        }
    }
}