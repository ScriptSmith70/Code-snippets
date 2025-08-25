import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix size
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter cols: ");
        int cols = sc.nextInt();

        int[][] mat = new int[rows][cols];

        // Input elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Count zeros and non-zeros
        int zeroCount = 0, nonZeroCount = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0) {
                    zeroCount++;
                } else {
                    nonZeroCount++;
                }
            }
        }

        // Check sparse condition
        if (zeroCount > nonZeroCount) {
            System.out.println("The matrix is a Sparse Matrix.");
        } else {
            System.out.println("The matrix is NOT a Sparse Matrix.");
        }
    }
}
