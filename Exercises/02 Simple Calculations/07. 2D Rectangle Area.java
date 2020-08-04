// АКО ПРЕПИСВАТЕ ДРАГНЕТЕ ФАЙЛА В JUDJE (Java code)
import java.util.Scanner;

public class RectangleArea {
    public static void main (String[] args){
    Scanner console = new Scanner(System.in);
        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());
        double area = Math.abs((x2-x1)*(y2-y1));
        double perimeter = 2*(Math.abs(x2-x1)+Math.abs(y2-y1));
        System.out.println(area);
        System.out.println(perimeter);


    }
}