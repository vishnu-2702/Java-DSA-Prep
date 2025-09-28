import java.util.Scanner;

public class CountOccurrences {
    //program to count occurrence of a digit in an integer
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int count = 0;

        while(n > 0){
            int rem = n%10;
            if(rem == k){
                count++;
            }
            n /= 10;
        }

        System.out.println(count);
    }
}
