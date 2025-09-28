import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal, time and rate");

        int principal = sc.nextInt();
        int time = sc.nextInt();
        int rate = sc.nextInt();
        
        int intrest = (principal*time*rate)/100;
        
        System.out.println("Intrest: "+ intrest);
        System.out.println("Total Amount: " + (principal+intrest));
    }
}
