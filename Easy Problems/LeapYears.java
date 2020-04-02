
import java.util.Scanner;

public class LeapYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Y = input.nextInt();        
        System.out.println((Y%4==0 && Y%400!=0) ? "Yes" : "No");
    }
}
