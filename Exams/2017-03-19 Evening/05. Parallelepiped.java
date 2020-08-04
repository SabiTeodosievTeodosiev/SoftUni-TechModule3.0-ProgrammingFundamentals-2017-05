import java.util.Scanner;

public class Parallelepiped {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        String tildas = repeatStr("~",n-2);
        String topAndBotDots = repeatStr(".",2*n+1);
        System.out.printf("+%s+%s%n",tildas,topAndBotDots);
        for (int row = 2; row <2*n+3 ; row++) {
            String upperLeftDots = repeatStr(".",row-2);
            String upperRightDots = repeatStr(".",2*n+2-row);
            System.out.printf("|%s\\%s\\%s%n",upperLeftDots,tildas,upperRightDots);
        }
        for (int row = 1; row <2*n+2 ; row++) {
            String lowerLeftDots = repeatStr(".",row-1);
            String lowerRightDots = repeatStr(".",2*n+1-row);
            System.out.printf("%s\\%s|%s|%n",lowerLeftDots,lowerRightDots,tildas);
        }
        System.out.printf("%s+%s+%n",topAndBotDots,tildas);
    }
    static String repeatStr(String strToRepeat, int count){
        String text = "";
        for (int i = 0; i < count ; i++) {
            text += strToRepeat;
        }
        return text;
    }
}