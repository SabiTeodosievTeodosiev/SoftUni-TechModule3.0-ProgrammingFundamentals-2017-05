import java.util.Scanner;

public class TrainersSalary {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        short lectures = Short.parseShort(console.nextLine());
        double budget = Double.parseDouble(console.nextLine());
        short jelevLectures = 0;
        short royalLectures = 0;
        short roliLectures = 0;
        short trofonLectures = 0;
        short sinoLectures = 0;
        short othersLectures = 0;
        double perLecture = budget/lectures;
        for (short lectureNum = 1; lectureNum <=lectures; lectureNum++) {
            String name = console.nextLine();
            if ("Jelev".equals(name)){
                jelevLectures++;
            } else if ("RoYaL".equals(name)){
                royalLectures++;
            } else if ("Roli".equals(name)){
                roliLectures++;
            } else if ("Trofon".equals(name)){
                trofonLectures++;
            } else if ("Sino".equals(name)){
                sinoLectures++;
            } else {
                othersLectures++;
            }
        }
        System.out.printf("Jelev salary: %.2f lv%nRoYaL salary: %.2f lv%nRoli salary: %.2f lv%nTrofon salary: %.2f lv%nSino salary: %.2f lv%nOthers salary: %.2f lv%n",jelevLectures*perLecture,royalLectures*perLecture,roliLectures*perLecture,trofonLectures*perLecture,sinoLectures*perLecture,othersLectures*perLecture);
    }
}