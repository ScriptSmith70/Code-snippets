import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int i;
        int[] arr = new int[n];
        for(i =0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(i = 0; i<n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr));
	
	}
}