import java.util.Scanner;

public class ArmstrongNumber {

    static boolean isArmstrong(int n){
        int temp = n;
        int length = String.valueOf(n).length();
        int ans = 0;
        while(temp > 0){
            int t = temp%10;
            ans += (int) Math.pow(t, length);
            temp = temp/10;
        }
        return ans == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the beginning and the end");
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = a; i <= b; i++){
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }
    }
}
