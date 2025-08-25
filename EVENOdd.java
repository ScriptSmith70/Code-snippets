import java.util.*;
public class EVENOdd {
     static void evenOdd(int a, int b) {
        // Your code here
        if (a%2 == 0){
            System.out.println(a);
            System.out.println(b);
        }
        else {
            System.out.println(b);
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();               
        int b = sc.nextInt();  
     
        evenOdd(a, b);
    }
}
