import java.util.Scanner;

public class Fibonacci {
    static void fibonacciSeries(int n){
        int first = 0, second = 1;

        for(int i = 0; i < n; i++){
            System.out.print(first + " ");

            int temp = first + second;
            first = second;
            second = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacciSeries(n);
    }
}
