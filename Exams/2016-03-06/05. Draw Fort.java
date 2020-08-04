//JUST DRAG THE FILE IN JUDGE (Java code)
import com.sun.org.apache.xpath.internal.SourceTree;
import java.util.Scanner;

public class DrawFort {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int half = n / 2;
        int topDashCount=2*n-4-2*half;
        String roof = repeatStr("^", half);
        String midDashes = repeatStr("_", topDashCount);
        String botDashes = repeatStr("_", half);
        String midSpaces = repeatStr(" ", 2 * n - 2);
        String botTopSpaces = repeatStr(" ", half);
        String botLowerSpaces = repeatStr(" ", topDashCount);
        System.out.printf("/%s\\%s/%s\\%n", roof, midDashes, roof);
        if (n<5) {
            for (int i = 0; i <n-2; i++) {
                System.out.printf("|%s|%n", midSpaces);
            }
            System.out.printf("\\%s/\\%s/%n",botDashes,botDashes);
        } else {
            for (int i = 0; i <n-3; i++) {
                System.out.printf("|%s|%n", midSpaces);
        }
            System.out.printf("|%s %s %s|%n",botTopSpaces,midDashes,botTopSpaces);
            System.out.printf("\\%s/%s\\%s/%n",botDashes, botLowerSpaces, botDashes);

        }
    }
    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}