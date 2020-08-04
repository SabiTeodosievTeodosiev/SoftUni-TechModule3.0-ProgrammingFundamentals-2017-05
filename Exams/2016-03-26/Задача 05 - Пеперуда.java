//FOR JUDGE DRAG AND DROP JAVA FILE (Java code)
import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = 1; i < 2*(n-2)+2; i++) {
            if (i % 2 == 1 && i < n-1 || i==1 ) {
                String stars = repeatStr("*", n-2);
                System.out.printf("%s\\ /%s%n", stars, stars);
            }
            if (i % 2 == 0 && i < n-1) {
                String stars = repeatStr("-", n-2);
                System.out.printf("%s\\ /%s%n", stars, stars);
            }
            if (i==n-1){
                String dashes = repeatStr(" ", n-1);
                System.out.printf("%s@%s%n", dashes, dashes);
            }
            if (i % 2 == 1  && i > n-1) {
                String stars = repeatStr("*", n-2);
                System.out.printf("%s/ \\%s%n", stars, stars);
            }
            if (i % 2 == 0  && i > n-1) {
                String stars = repeatStr("-", n-2);
                System.out.printf("%s/ \\%s%n", stars, stars);
            }
        }
    }
    static String repeatStr(String strToRepeat, int count){
        String text = "";
        for (int i = 0; i < count ; i++) {
            text += strToRepeat;
        }
        return text;
    }
}