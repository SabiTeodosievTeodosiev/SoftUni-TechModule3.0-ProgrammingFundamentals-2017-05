//JUST DRAG THE FILE IN JUDGE (Java code)
import java.util.Scanner;

public class EqualWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String firstWord = console.nextLine();
        String secondWord = console.nextLine();
        String lowerFirstWord = firstWord.toLowerCase();
        String lowerSecondWord = secondWord.toLowerCase();
        if (lowerFirstWord.equals(lowerSecondWord)){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }       
    }
}