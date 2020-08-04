import java.util.Scanner;

public class ChristmasHat {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        short n = Short.parseShort(console.nextLine());
        String topDots = repeatStr(".",2*n-1);
        System.out.printf("%s/|\\%s%n%s\\|/%s%n",topDots,topDots,topDots,topDots);
        for (int i = 0; i <2*n ; i++) {
            String dots = repeatStr(".",2*n-1-i);
            String dashes = repeatStr("-",i);
            System.out.printf("%s*%s*%s*%s%n",dots,dashes,dashes,dots);
        }
        String rowOfStars = repeatStr("*",4*n+1);
        String rowAlterating = repeatStr("*.",2*n);
        System.out.printf("%s%n%s*%n%s%n",rowOfStars,rowAlterating,rowOfStars);
    }
    static String repeatStr(String strToRepeat, int count){
        String text = "";
        for (int i = 0; i < count ; i++) {
            text += strToRepeat;
        }
        return text;
    }
}