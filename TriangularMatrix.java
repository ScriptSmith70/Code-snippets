class Main {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = mat.length;

        // Upper triangular
        System.out.println("Upper triangular:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j) {
                    System.out.print(mat[i][j] + " ");
                } else {
                    System.out.print("  "); // spaces for shape
                }
            }
            System.out.println();
        }

        // Lower triangular
        System.out.println("Lower triangular:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j) {
                    System.out.print(mat[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
