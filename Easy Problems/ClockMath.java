
import java.util.Scanner;

public class ClockMath {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h = input.nextInt(), m = input.nextInt();

        if (h == 12) {
            h = 0;
        }
        if (m == 60) {
            m = 0;
        }
        double hourdegree = (0.5 * (h * 60 + m));
        double minutedegree = (6 * m);
        double degree = Math.abs(hourdegree - minutedegree);
        degree = Math.min(360 - degree, degree);
        System.out.println(degree);
    }
}
