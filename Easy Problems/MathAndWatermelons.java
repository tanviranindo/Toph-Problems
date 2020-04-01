
import java.util.Scanner;

public class MathAndWatermelons {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int watermelon = input.nextInt();
        int people = input.nextInt();
        System.out.println(watermelon % people);

    }
}
