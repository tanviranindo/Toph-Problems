
import java.util.Scanner;

public class FibonacciNumbers {

    static int Fibonacci(int N){
        return N<=2 ? 1 : Fibonacci(N-2)+Fibonacci(N-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();        
        System.out.println(Fibonacci(N));
    }
}
