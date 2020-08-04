//JUST DRAG AND DROP IN JUDGE (Java code)
import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = new String(console.nextLine());
        if ("banana".equals(input) || "apple".equals(input) || "kiwi".equals(input) || "cherry".equals(input) || "lemon".equals(input) || "grapes".equals(input)) {
            System.out.println("fruit");
        } else if ("tomato".equals(input) || "cucumber".equals(input) || "pepper".equals(input) || "carrot".equals(input)) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}