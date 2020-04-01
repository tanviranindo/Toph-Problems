
import java.util.Scanner;

public class RunningAverageAgain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        double sum = 0;
        for (int i = 1; i <= N; i++) {
            int D = input.nextInt();
            sum = sum + D;
            System.out.println(sum / i);
        }

    }
}
