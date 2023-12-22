class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        if (mat.length == 0) {
            return false;
        }

        int[][] original = cloneMatrix(mat);

        int rows = mat.length;
        int cols = mat[0].length;

        for (int x = 0; x < k; x++) {
            for (int i = 0; i < rows; i++) {
                rotate(mat[i], (i % 2 == 1) ? 1 : -1);
            }
        }

        return Arrays.deepEquals(original, mat);
    }

    private int[][] cloneMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] copy = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            System.arraycopy(matrix[i], 0, copy[i], 0, cols);
        }

        return copy;
    }

    private void rotate(int[] row, int direction) {
        int n = row.length;
        int[] temp = Arrays.copyOf(row, n);

        for (int i = 0; i < n; i++) {
            int newPos = (i + direction + n) % n;
            row[newPos] = temp[i];
        }
    }
}
