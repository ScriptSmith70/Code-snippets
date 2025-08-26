import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        int i;
       for(i = 0; i<n; i++){
           System.out.print(a + " ");
            int temp = a+b;
            a = b;
            b = temp;
        }
        System.out.println();
	
	}
}