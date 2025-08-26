import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        area(); 
    }

    static void area() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int radius = sc.nextInt();  
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}

