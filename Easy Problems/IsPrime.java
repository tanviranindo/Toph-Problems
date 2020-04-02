
import java.util.Scanner;

public class IsPrime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int counter = 0;
        for (int i = 1; i <= A; i++) {
            if (A % i == 0) {
                counter++;
            }
        }
        System.out.println(counter == 2 ? "Yes" : "No");
    }
}
