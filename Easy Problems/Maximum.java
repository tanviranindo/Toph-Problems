
import java.util.Scanner;

public class Maximum {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int max = 0;
        int array[] = new int[A];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
