import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        short juniors = Short.parseShort(console.nextLine());
        short seniors = Short.parseShort(console.nextLine());
        String trace = console.nextLine();
        if ("trail".equals(trace)) {
            System.out.printf("%.2f%n",(5.5*juniors+7*seniors)*0.95);
        } else if ("cross-country".equals(trace) && juniors+seniors>=50){
            System.out.printf("%.2f%n",(8*juniors+9.5*seniors)*0.7125);
        } else if ("cross-country".equals(trace) && juniors+seniors<50){
            System.out.printf("%.2f%n",(8*juniors+9.5*seniors)*0.95);
        } else if ("downhill".equals(trace)){
            System.out.printf("%.2f%n",(12.25*juniors+13.75*seniors)*0.95);
        } else if ("road".equals(trace)) {
            System.out.printf("%.2f%n",(20*juniors+21.5*seniors)*0.95);
        }
    }
}