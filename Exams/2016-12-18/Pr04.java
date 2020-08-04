import java.util.Scanner;

/**
 * Created by Guest Lector on 3/11/2017.
 */
public class Pr04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double studentCount = Double.parseDouble(scanner.nextLine());
        double count5 = 0;
        double count4 = 0;
        double count3 = 0;
        double count2 = 0;
        double totalGrade = 0d;
        for (int i = 1; i <= studentCount; i++) {
            double currGrade = Double.parseDouble(scanner.nextLine());
            totalGrade += currGrade;
            if (currGrade >= 5.0d) {
                count5++;
            } else if (currGrade >= 4d) {
                count4++;
            } else if (currGrade >= 3d) {
                count3++;
            } else if (currGrade < 3d) {
                count2++;
            }
        }
        double avgGrade = totalGrade / studentCount;
        double percent5 = (count5 / studentCount) * 100d;
        double percent4 = (count4 / studentCount) * 100d;
        double percent3 = (count3 / studentCount) * 100d;
        double percent2 = (count2 / studentCount) * 100d;
        System.out.printf("Top students: %.2f%%%n", percent5);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", percent4);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", percent3);
        System.out.printf("Fail: %.2f%%%n", percent2);
        System.out.printf("Average: %.2f%n", avgGrade);
    }
}
