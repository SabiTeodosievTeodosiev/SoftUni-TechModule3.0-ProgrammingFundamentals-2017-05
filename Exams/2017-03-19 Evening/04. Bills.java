import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int months = Integer.parseInt(console.nextLine());
        double totalPowerBill = 0;
        for (int i = 0; i < months ; i++) {
            double powerBill = Double.parseDouble(console.nextLine());
            totalPowerBill+=powerBill;
        }

        System.out.printf("Electricity: %.2f lv%n", totalPowerBill);
        System.out.printf("Water: %.2f lv%n", months*20.00);
        System.out.printf("Internet: %.2f lv%n", months*15.00);
        System.out.printf("Other: %.2f lv%n", (months*35.00+totalPowerBill)*1.20);
        System.out.printf("Average: %.2f lv%n", ((months*35.00+totalPowerBill)*1.20+totalPowerBill+months*35.00)/months);

    }
}