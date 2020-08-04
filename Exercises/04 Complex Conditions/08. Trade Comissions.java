//JUST DRAG AND DROP IN JUDGE (Java code)
import java.util.Scanner;

public class TradeComissions {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String city = console.nextLine();
        double s = Double.parseDouble(console.nextLine());
        if (city.equals("Sofia")) {
            if (s>=0 && s<=500) {
                System.out.println(s*0.05);
            } else if (s>500 && s<=1000) {
                System.out.println(s*0.07);
            } else if (s>1000 && s<=10000) {
                System.out.println(s*0.08);
            } else if (s>10000) {
                System.out.println(s*0.12);
            } else {
                System.out.println("error");
            }
        } else if (city.equals("Varna")) {
            if (s>=0 && s<=500) {
                System.out.println(s*0.045);
            } else if (s>500 && s<=1000) {
                System.out.println(s*0.075);
            } else if (s>1000 && s<=10000) {
                System.out.println(s*0.1);
            } else if (s>10000) {
                System.out.println(s*0.13);
            } else {
                System.out.println("error");
            }
        } else if (city.equals("Plovdiv")) {
            if (s>=0 && s<=500) {
                System.out.println(s*0.055);
            } else if (s>500 && s<=1000) {
                System.out.println(s*0.08);
            } else if (s>1000 && s<=10000) {
                System.out.println(s*0.12);
            } else if (s>10000) {
                System.out.println(s*0.145);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}