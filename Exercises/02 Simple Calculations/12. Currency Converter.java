// АКО ПРЕПИСВАТЕ ДРАГНЕТЕ ФАЙЛА В JUDJE (Java code)
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double sum = Double.parseDouble(console.nextLine());
        String a = console.nextLine();
        String b = console.nextLine();
        if (a.equals("BGN")) {
            if (b.equals("USD")) {
                double result = sum / 1.79549;
                System.out.println(result + " USD");
            } else if (b.equals("EUR")) {
                double result = sum / 1.95583;
                System.out.println((result + " EUR"));
            } else if (b.equals("GBP")) {
                double result = sum / 2.53405;
                System.out.println((result + " GBP"));
            }
        } else if (a.equals("USD")) {
            if (b.equals("BGN")) {
                double result = sum * 1.79549;
                System.out.println(result + " BGN");
            } else if (b.equals("EUR")) {
                double result = sum * 0.91802;
                System.out.println((result + " EUR"));
            } else if (b.equals("GBP")) {
                double result = sum * 1.29564;
                System.out.println((result + " GBP"));
            }
        } else if (a.equals("EUR")) {
            if (b == "USD") {
                double result = sum / 0.91802;
                System.out.println(result + " USD");
            } else if (b.equals("BGN")) {
                double result = sum * 1.95583;
                System.out.println((result + " BGN"));
            } else if (b.equals("GBP")) {
                double result = sum * 0.77182;
                System.out.println((result + " GBP"));
            }
        } else if (a.equals("GBP")) {
            if (b.equals("USD")) {
                double result = sum / 0.70855;
                System.out.println(result + " USD");
            } else if (b.equals("EUR")) {
                double result = sum * 1.26967;
                System.out.println((result + " EUR"));
            } else if (b.equals("BGN")) {
                double result = sum * 2.53405;
                System.out.println((result + " BGN"));
            }
        }
    }
}