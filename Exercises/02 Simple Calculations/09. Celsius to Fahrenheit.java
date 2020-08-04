// АКО ПРЕПИСВАТЕ ДРАГНЕТЕ ФАЙЛА В JUDJE (Java code)
import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        double celsius = Double.parseDouble(console.nextLine());
        double fahrenheit = celsius*1.8+32;
        System.out.printf("%.2f", fahrenheit);
    }
}