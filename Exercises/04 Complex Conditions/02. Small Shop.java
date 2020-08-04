//JUST DRAG AND DROP IN JUDGE (Java code)
import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String product = console.nextLine().toLowerCase();
        String town = console.nextLine().toLowerCase();
        double quantity = Double.parseDouble(console.nextLine());
        if ("sofia".equals(town)) {
            if ("coffee".equals(product)) {
                System.out.println(0.50*quantity);
            } else if ("water".equals(product)) {
                System.out.println(0.80*quantity);
            }else if ("beer".equals(product)) {
                System.out.println(1.20*quantity);
            }else if ("sweets".equals(product)) {
                System.out.println(1.45*quantity);
            }else if ("peanuts".equals(product)) {
                System.out.println(1.60*quantity);
            }
        } else if ("plovdiv".equals(town)) {
            if ("coffee".equals(product)) {
                System.out.println(0.40*quantity);
            } else if ("water".equals(product)) {
                System.out.println(0.70*quantity);
            }else if ("beer".equals(product)) {
                System.out.println(1.15*quantity);
            }else if ("sweets".equals(product)) {
                System.out.println(1.30*quantity);
            }else if ("peanuts".equals(product)) {
                System.out.println(1.50*quantity);
            }
        }if ("varna".equals(town)) {
            if ("coffee".equals(product)) {
                System.out.println(0.45*quantity);
            } else if ("water".equals(product)) {
                System.out.println(0.70*quantity);
            }else if ("beer".equals(product)) {
                System.out.println(1.10*quantity);
            }else if ("sweets".equals(product)) {
                System.out.println(1.35*quantity);
            }else if ("peanuts".equals(product)) {
                System.out.println(1.55*quantity);
            }
        }
    }
}