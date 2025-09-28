import java.util.Scanner;

public class InrtoUsd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double inr = sc.nextDouble();

        double res = inr * 0.01134d;
        System.out.print("INR: " + inr + " USD: ");
        System.out.printf("%.2f",res);
    }
}
