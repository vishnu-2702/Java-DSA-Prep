import java.util.*;
public class LcmHcf {

    static int lcm(int a, int b){
        int res = (a > b) ? a : b;

        while (true) {
            if(res%a == 0 && res%b == 0){
                break;
            }
            res++;
        }
        return res;
    }

    static int improvedLcm(int a ,int b){
        return a*b/improvedEuclidGCD(a, b);
    }

    static int euclidGCD(int a,int b){
        while (a != b) {
            if(a > b){
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    static int improvedEuclidGCD(int a, int b){
        while(a != 0 && b != 0){
            if(a > b){
                a = a % b;
            } else {
                b = b % a;
            }
        }

        return (a == 0) ? b : a;
    }

    static int gcd(int a, int b){
        int min = (a < b) ? a : b;

        for(int i = min; i >= 1; i--){
            if(a%i == 0 && b%i == 0){
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("GCD: " + improvedEuclidGCD(a, b));
        System.out.println("LCM: " + improvedLcm(a, b));
        

        sc.close();
    }
}
