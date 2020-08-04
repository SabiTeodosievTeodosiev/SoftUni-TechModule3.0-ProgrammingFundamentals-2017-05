//JUST DRAG IN JUDGE (Java code)
import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int sideDashCount = (n-1)/2;
        int centerDashCount = 0;
        for (int i = 0; i <n/2+n%2 ; i++) {
            String sideDashes = repeatStr("-", sideDashCount);
            centerDashCount = n-2-2*sideDashCount;
            String centerDashes = "";
            if (centerDashCount>0){
                centerDashes = repeatStr("-", centerDashCount);
            }
            if((i==0 || i== n-1) && n%2!=0){
                 System.out.println(sideDashes + "*" + sideDashes);
            } else {
                System.out.println(sideDashes + "*" + centerDashes + "*" + sideDashes);
            }
            sideDashCount--;
        }
        sideDashCount+=2;
        for (int i = 0; i <n/2+n%2-1 ; i++) {
            String sideDashes = repeatStr("-", sideDashCount);
            String centerDashes = "";
            centerDashCount = n-2-2*sideDashCount;
            if (centerDashCount>0){
                centerDashes = repeatStr("-", centerDashCount);
            }
            if(i==n/2+n%2-2 && n%2 !=0){
                System.out.println(sideDashes + "*" + sideDashes);
            } else {
                System.out.println(sideDashes + "*" + centerDashes + "*" + sideDashes);
            }
            sideDashCount++;
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