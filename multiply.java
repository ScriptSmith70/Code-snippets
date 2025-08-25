import java.util.*;
public class multiply{
    public static void main(String[] args){
        product();

    }
    static void product(){
        int num1, num2, product1;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        product1 = num1*num2;
        System.out.println(product1);
        sc.close();


    }
}