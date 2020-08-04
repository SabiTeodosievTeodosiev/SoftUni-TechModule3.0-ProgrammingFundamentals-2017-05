import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        byte turns = Byte.parseByte(console.nextLine());
        double sum = 0;
        byte zero = 0;
        byte one = 0;
        byte two = 0;
        byte three = 0;
        byte four = 0;
        byte invalid = 0;
        for (byte i = 0; i < turns; i++) {
            byte currNum = Byte.parseByte(console.nextLine());
            if (currNum>=0 && currNum<10){
                sum+=0.2*currNum;
                zero++;
            } else if (currNum>=10 && currNum<20){
                sum+=0.3*currNum;
                one++;
            } else if (currNum>=20 && currNum<30) {
                sum+=0.4*currNum;
                two++;
            } else if (currNum>=30 && currNum<40) {
                sum+=50.0;
                three++;
            } else if (currNum>=40 && currNum<=50){
                sum+=100.0;
                four++;
            } else {
                sum/=2;
                invalid++;
            }
        }
        System.out.printf("%.2f%nFrom 0 to 9: %.2f%%%nFrom 10 to 19: %.2f%%%nFrom 20 to 29: %.2f%%%nFrom 30 to 39: %.2f%%%nFrom 40 to 50: %.2f%%%nInvalid numbers: %.2f%%%n", sum, zero*100.0/turns, one*100.0/turns, two*100.0/turns, three*100.0/turns, four*100.0/turns, invalid*100.0/turns);
    }
}