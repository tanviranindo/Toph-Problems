
import java.util.Scanner;

public class MissingNumbers {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        int A = 0, B = input.nextInt();
        for (int i = 0; i < 3; i++) {
            A += input.nextInt();
        }
        System.out.print(B - A);
    }
}
