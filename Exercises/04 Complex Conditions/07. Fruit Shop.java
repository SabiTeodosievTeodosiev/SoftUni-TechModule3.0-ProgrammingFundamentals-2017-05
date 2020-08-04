//JUST DRAG AND DROP IN JUDGE (Java code)
import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String fruit = console.nextLine();
        String day = console.nextLine();
        double kg = Double.parseDouble(console.nextLine());
        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            if (fruit.equals("banana")) {
                System.out.println(kg * 2.5);
            } else if (fruit.equals("apple")) {
                System.out.println(kg * 1.2);
            } else if (fruit.equals("orange")) {
                System.out.println(kg * 0.85);
            } else if (fruit.equals("grapefruit")) {
                System.out.println(kg * 1.45);
            } else if (fruit.equals("kiwi")) {
                System.out.println(kg * 2.7);
            } else if (fruit.equals("pineapple")) {
                System.out.println(kg * 5.5);
            } else if (fruit.equals("grapes")) {
                System.out.println(kg * 3.85);
            } else {
                System.out.println("error");
            }
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            if (fruit.equals("banana")) {
                System.out.println(kg * 2.7);
            } else if (fruit.equals("apple")) {
                System.out.println(kg * 1.25);
            } else if (fruit.equals("orange")) {
                System.out.println(kg * 0.9);
            } else if (fruit.equals("grapefruit")) {
                System.out.println(kg * 1.6);
            } else if (fruit.equals("kiwi")) {
                System.out.println(kg * 3);
            } else if (fruit.equals("pineapple")) {
                System.out.println(kg * 5.6);
            } else if (fruit.equals("grapes")) {
                System.out.println(kg * 4.20);
            } else {
                System.out.println("error");
            }

        } else {
            System.out.println("error");
        }
    }
}