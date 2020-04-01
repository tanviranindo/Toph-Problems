
import java.util.Scanner;
import java.text.DecimalFormat;

public class FormattedNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        DecimalFormat formatter = new DecimalFormat("#,###,###");
        System.out.println(formatter.format(A));
    }
}
