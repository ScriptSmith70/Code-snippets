import java.util.*;

public class Multiply {
    public static void main(String[] args) {
        int result = product(); 
        System.out.println("Product: " + result); 
    }

    static int product() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        return num1*num2;
        
        sc.close();

       
    }
}
