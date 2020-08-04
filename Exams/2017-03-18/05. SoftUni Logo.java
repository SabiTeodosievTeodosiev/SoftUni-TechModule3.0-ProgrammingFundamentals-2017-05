import java.util.Scanner;

public class SoftUniLogo {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        short n = Short.parseShort(console.nextLine());
        for (int row = 1; row <=2*n ; row++) {
            String topDots = repeatStr(".", 6*n-3*row);
            String topDashes = repeatStr("#",6*row-5);
            System.out.printf("%s%s%s%n",topDots,topDashes,topDots);
        }
        for (int row = 1; row <=n-2 ; row++) {
            String midDots = repeatStr(".",3*row-1);
            String midDashes = repeatStr("#",12*n-5-6*row);
            System.out.printf("|%s%s%s.%n", midDots, midDashes, midDots);
        }
        String botDots = repeatStr(".",3*n-4);
        String botDashes = repeatStr("#",6*n+1);

        for (int row = 1; row <= n-1; row++) {
            System.out.printf("|%s%s%s.%n",botDots,botDashes,botDots);
        }
        System.out.printf("@%s%s%s.%n",botDots,botDashes,botDots);
    }
    static String repeatStr(String strToRepeat, int count){
        String text = "";
        for (int i = 0; i < count ; i++) {
            text += strToRepeat;
        }
        return text;
    }
}