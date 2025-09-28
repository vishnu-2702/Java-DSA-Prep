import java.util.Scanner;

public class SCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operation = sc.next().trim().charAt(0);
        int res = 0;

        switch (operation) {
            case '*' :
                res = a*b;
                break;
            case '/' :
                res = a/b;
                break;
            case '+' :
                res = a+b;
                break;
            case '-' :
                res = a-b;
                break;
            default:
                System.out.print("Not a valid operation : ");
                break;
        }

        System.out.println("Result: " + res);
    }
}
