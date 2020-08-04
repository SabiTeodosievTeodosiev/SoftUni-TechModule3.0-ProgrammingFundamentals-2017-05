import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int studentCount = Integer.parseInt(console.nextLine());
        int failCount=0;
        int threes=0;
        int fours=0;
        int tops=0;
        double totalSum = 0;
        for (int i = 0; i < studentCount ; i++) {
            double result = Double.parseDouble(console.nextLine());
            totalSum+=result;
            if (result<3d) {
                failCount+=1;
            } else if (result>=3d && result<4d){
                threes+=1;
            } else if (result>=4d && result<5){
                fours+=1;
            } else {
                tops+=1;
            }
        }
        System.out.printf("Top students: %.2f%%%n",(double)tops*100/studentCount);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",(double)fours*100/studentCount);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",(double)threes*100/studentCount);
        System.out.printf("Fail: %.2f%%%n",(double)failCount*100/studentCount);
        System.out.printf("Average: %.2f%n",totalSum/(double)studentCount);
    }
}