//JUST DRAG THE FILE IN JUDGE (Java code)
import java.util.Scanner;

public class PasswordGuess {
    public static void main() {
        Scanner console = new Scanner(System.in);
        String password = console.nextLine();
        if (password.equals("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}