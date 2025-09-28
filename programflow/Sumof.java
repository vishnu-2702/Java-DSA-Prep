import java.util.*;

public class Sumof {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int res = 0;

        System.out.println("Enter the numbers: ");

        while(sc.hasNext()){
            String temp = sc.nextLine();
            if(!temp.equals("x")){
                res += Integer.parseInt(temp);
            } else{
                break;
            }
        }

        System.out.println("Sum : " + res);
        sc.close();
    }
}
