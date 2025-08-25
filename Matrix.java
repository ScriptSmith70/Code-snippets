import java.util.Scanner;
public class Matrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Creating 2d array
        System.out.println("Enter the no.of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the no.of cols");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];

        // Traversing
        for(int i =0; i < rows; i++){
            for(int j=0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // Printing matrix properly
        System.out.println("Matrix:");
        for(int i =0; i < rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Sum
        int sum =0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum = "+ sum );

        // Max
        int max = Integer.MIN_VALUE;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Max = " + max);
    }
}
