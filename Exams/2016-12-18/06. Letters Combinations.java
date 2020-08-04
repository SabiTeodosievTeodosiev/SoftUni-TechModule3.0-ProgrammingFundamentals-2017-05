import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char char1 = console.nextLine().charAt(0);
        char char2 = console.nextLine().charAt(0);
        char char3 = console.nextLine().charAt(0);
        int totalNum = 0;
        StringBuilder out = new StringBuilder();
        for (char i = char1; i <= char2; i++) {
            if (i==char3) {
                continue;
            }
            for (char j = char1; j <= char2; j++) {
                if (j==char3) {
                    continue;
                }
                for (char k = char1; k <= char2; k++) {
                    if (k==char3) {
                        continue;
                    }
                    out.append(i);
                    out.append(j);
                    out.append(k);
                    out.append(" ");
                    totalNum++;
                }
            }
        }
        out.append(totalNum);
        System.out.println(out);
    }
}