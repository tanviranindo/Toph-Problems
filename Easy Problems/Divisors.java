
import java.util.Scanner;

public class Divisors {

    static void Divisors(int input, int count) {
        if (input % count == 0) {
            System.out.println(count);
            count++;
            Divisors(input, count);
        } else if (input % count != 0) {
            count++;
            if(input!=count)Divisors(input, count);
            else System.out.println(input);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = 1;
        Divisors(A, B);
    }

}
