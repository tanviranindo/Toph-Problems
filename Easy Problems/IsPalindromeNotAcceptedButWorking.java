
import java.util.Scanner;

public class IsPalindromeNotAcceptedButWorking{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next().toLowerCase();
        char transform[] = s.toCharArray();
        String condition = "";

        for (int i = 0, j = transform.length - 1; i < transform.length && j >= 0; i++, j--) {
            if (transform[i] == transform[j]) {
                condition = "Yes";
            } else {
                condition = "No";
            }
        }
        System.out.println(condition);
    }
}
