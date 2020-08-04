//JUST DRAG AND DROP IN JUDGE (Java code)
public class NumbersEndingIn7 {
    public static void main(String[] args) {
        for (int i = 0; i<=1000; i++){
            if (i % 10 == 7) {
                System.out.println(i);
            }
        }
    }
}