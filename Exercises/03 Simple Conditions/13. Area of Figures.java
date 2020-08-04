//JUST DRAG THE FILE IN JUDGE (Java code)
import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String type = console.nextLine();
        if (type.equals("square")) {
            double side = Double.parseDouble(console.nextLine());
            System.out.println(side*side);
        } else if (type.equals("rectangle")){
            double firstSide = Double.parseDouble(console.nextLine());
            double secondSide = Double.parseDouble(console.nextLine());
            System.out.println(firstSide*secondSide);
        } else if (type.equals("circle")){
            double side = Double.parseDouble(console.nextLine());
            System.out.println(Math.PI*side*side);
        } else if (type.equals("triangle")){
            double side = Double.parseDouble(console.nextLine());
            double height = Double.parseDouble(console.nextLine());
            System.out.println(side*height/2);
        }
    }
}