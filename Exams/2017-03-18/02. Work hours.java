import java.util.Scanner;

public class WorkHours {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int hours = Integer.parseInt(console.nextLine());
        int workers = Integer.parseInt(console.nextLine());
        int days = Integer.parseInt(console.nextLine());
        int manHours = workers*days*8;
        if (manHours>=hours){
            System.out.printf("%d hours left%n",manHours-hours);
        } else {
            System.out.printf("%d overtime%nPenalties: %d%n", hours-manHours,(hours-manHours)*days);
        }
    }
}