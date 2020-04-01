
import java.util.Scanner;

public class IsPalindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next().toLowerCase();
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        System.out.println(s.equals(reverse) ? "Yes":"No");
    }
}
