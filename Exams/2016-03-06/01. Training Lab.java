//JUST DRAG THE FILE IN JUDGE (Java code)
import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Double h = Double.parseDouble(console.nextLine());
        Double w = Double.parseDouble(console.nextLine());
        int hNum = (int) (h/1.2);
        int wNum = (int) ((w-1)/0.7);
        int total = hNum * wNum -3;
        System.out.println(total);
    }
}