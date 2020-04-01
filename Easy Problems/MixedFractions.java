
import java.util.Scanner;

public class MixedFractions {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        while(!(N>1 && N<100)){
        N = input.nextInt();
        }
        int D = input.nextInt();
        while(!(D>1 && D<N)){
        D = input.nextInt();
        }
        System.out.println(N/D+" "+N%D+" "+D);
    }
}
