// АКО ПРЕПИСВАТЕ ДРАГНЕТЕ ФАЙЛА В JUDJE (Java code)
import java.util.Scanner;

public class RadiansToDegrees {
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        double rad = Double.parseDouble(console.nextLine());
        double deg = rad*180/Math.PI;
        System.out.printf("%.0f", deg);
    }
}