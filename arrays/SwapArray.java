import java.util.Arrays;
import java.util.Scanner;

public class SwapArray {
    public  static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    public  static  void reverseArray(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while (i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
