import java.util.Scanner;

public class GrapeAndRakia {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        double area = Double.parseDouble(console.nextLine());
        double debit = Double.parseDouble(console.nextLine());
        double brak = Double.parseDouble(console.nextLine());
        double rakia = (area*debit-brak)*0.45*9.8/7.5;
        double grape = (area*debit-brak)*0.55*1.5;
        System.out.printf("%.2f%n",rakia);
        System.out.printf("%.2f%n",grape);
    }
}