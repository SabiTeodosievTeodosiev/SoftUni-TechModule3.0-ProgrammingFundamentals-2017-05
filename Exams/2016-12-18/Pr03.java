import java.util.Scanner;

/**
 * Created by Guest Lector on 3/11/2017.
 */
public class Pr03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hrizantemsCount = Integer.parseInt(scanner.nextLine());
        int rosesCount = Integer.parseInt(scanner.nextLine());
        int tulipCount = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
//        String holiday = scanner.nextLine();
//        boolean isHoliday;
//        if (holiday.equals("Y")) {
//            isHoliday = true;
//        } else  {
//            isHoliday = false;
//        }
        boolean isHoliday = scanner.nextLine().equals("Y");
        double hrizantemsPrice = 0d;
        double rosesPrice = 0d;
        double tulipsPrice = 0d;
        if (season.equals("Spring") || season.equals("Summer")) {
            hrizantemsPrice = 2d;
            rosesPrice = 4.1d;
            tulipsPrice = 2.5d;
        } else {
            hrizantemsPrice = 3.75d;
            rosesPrice = 4.5d;
            tulipsPrice = 4.15d;
        }
        if (isHoliday) {
            hrizantemsPrice *= 1.15d;
            rosesPrice *= 1.15d;
            tulipsPrice *= 1.15d;
        }
        hrizantemsPrice *= hrizantemsCount;
        rosesPrice *= rosesCount;
        tulipsPrice *= tulipCount;
        double totalPrice = hrizantemsPrice + rosesPrice + tulipsPrice;
//        System.out.println(totalPrice);
        if (tulipCount > 7 && season.equals("Spring")) {
            totalPrice -= totalPrice * 0.05d;
        }
//        System.out.println(totalPrice);
        if (rosesCount >= 10 && "Winter".equals(season)) {
            totalPrice -= totalPrice * 0.1d;
        }
        if (tulipCount + rosesCount + hrizantemsCount > 20) {
            totalPrice -= totalPrice * 0.2d;
        }
        System.out.println(String.format("%.2f", totalPrice + 2d));
    }
}
