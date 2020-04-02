
import java.util.Scanner;

public class IsAnagram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.next(), B = input.next();
        int counter = 0;
        char arrayA[] = A.toCharArray(), arrayB[] = B.toCharArray();

        for (int i = 0; i<arrayA.length; i++) {
            for (int j = 0; j<arrayB.length; j++) {
                if(arrayA[i] == arrayB[j]){
                    counter++;
                }
            }
        }
        System.out.println((counter==arrayA.length) ? "Yes" : "No");
    }
}