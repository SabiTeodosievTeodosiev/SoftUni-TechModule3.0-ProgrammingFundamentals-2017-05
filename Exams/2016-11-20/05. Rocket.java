import java.util.Scanner;

public class Rocket {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        short n = Short.parseShort(console.nextLine());

        for (int i = 0; i < n ; i++) {
            String topDashes = repeatStr(" ", 2*i);
            String topDots = repeatStr(".",3*n/2-1-i);
            System.out.printf("%s/%s\\%s%n",topDots,topDashes,topDots);
        }
        String topStars = repeatStr("*",2*n);
        String midDots = repeatStr(".",n/2);
        String midTildas = repeatStr("\\",2*n-2);
        System.out.printf("%s%s%s%n",midDots,topStars,midDots);
        for (int i = 0; i < 2*n; i++) {
            System.out.printf("%s|%s|%s%n",midDots,midTildas,midDots);
        }
        for (int i = n/2; i >0 ; i--) {
            String botDots = repeatStr(".",i);
            String botStars = repeatStr("*",3*n-2-2*i);
            System.out.printf("%s/%s\\%s%n",botDots,botStars,botDots);
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