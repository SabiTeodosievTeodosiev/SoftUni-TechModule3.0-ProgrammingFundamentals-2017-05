//JUST DRAG AND DROP IN JUDGE (Java code)
import java.util.Scanner;

public class AnimalType {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String animal = console.nextLine();
        String animalType;
        switch (animal) {
            case "dog": animalType = "mammal";
            break;
            case "crocodile": animalType = "reptile";
            break;
            case "tortoise": animalType = "reptile";
                break;
            case "snake": animalType = "reptile";
                break;
            default: animalType = "unknown";
            break;
        }
        System.out.println(animalType);
    }
}