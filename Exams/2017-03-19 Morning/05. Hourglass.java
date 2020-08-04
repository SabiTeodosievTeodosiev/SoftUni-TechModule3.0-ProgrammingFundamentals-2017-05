import java.util.Scanner;

public class Hourglass {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        short n = Short.parseShort(console.nextLine());
        String stars = repeatStr("*",2*n+1);
        String spaces = repeatStr(" ",2*n-3);
        System.out.printf("%s%n.*%s*.%n",stars,spaces);
        for (short row = 1; row < n-1; row++) {
            String dots = repeatStr(".",row+1);
            String eyes = repeatStr("@",2*n-3-2*row);
            System.out.printf("%s*%s*%s%n",dots, eyes, dots);
        }
        String dots = repeatStr(".",n);
        System.out.printf("%s*%s%n",dots,dots);
        for (short row = 1; row < n-1; row++) {
            String lowerDots = repeatStr(".",n-row);
            String lowerSpaces = repeatStr(" ",row-1);
            System.out.printf("%s*%s@%s*%s%n",lowerDots,lowerSpaces,lowerSpaces,lowerDots);
        }
        String eyes = repeatStr("@",2*n-3);
        System.out.printf(".*%s*.%n%s%n", eyes, stars);
    }
    static String repeatStr(String strToRepeat, int count){
        String text = "";
        for (int i = 0; i < count ; i++) {
            text += strToRepeat;
        }
        return text;
    }
}