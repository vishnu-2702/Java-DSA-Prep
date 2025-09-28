import java.util.Scanner;

public class FibonacciNumber {

    //fibonacci using recursion
    public static int fibonacciR(int n){
        if(n <= 0) return 0;
        else if (n == 1) return 1;
        return fibonacciR(n-1) + fibonacciR(n-2);
    }

    public static void fibonacci(int n){
        int a = 0;
        int b = 1;

        for(int i = 0; i <= n; i++){
            System.out.print(a + " ");
            int temp = a+b;
            a = b;
            b = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        fibonacci(n);
        System.out.println();
        System.out.println(fibonacciR(n));
    }
}
