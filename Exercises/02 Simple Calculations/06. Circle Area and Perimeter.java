// АКО ПРЕПИСВАТЕ ДРАГНЕТЕ ФАЙЛА В JUDJE (Java code)
import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        double r = Double.parseDouble(console.nextLine());
        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;
        System.out.println("Area is " + area);
        System.out.println("Perimeter is " + perimeter);
    }
}