class Main {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = mat.length;
        int cols = mat[0].length;

        // Row sums
        System.out.println("Row sums:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += mat[i][j];
            }
            System.out.println("Row " + i + " sum = " + rowSum);
        }

        // Column sums
        System.out.println("\nColumn sums:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += mat[i][j];
            }
            System.out.println("Column " + j + " sum = " + colSum);
        }
    }
}

