public class Solution {
    public static boolean isToeplitzMatrix(int[][] matrix) {
        Map<Integer, Integer> diagonalMap = new HashMap<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                int diagKey = row - col;
                if (!diagonalMap.containsKey(diagKey)) {
                    diagonalMap.put(diagKey, matrix[row][col]);
                } else if (diagonalMap.get(diagKey) != matrix[row][col]) {
                    return false;
                }
            }
        }

        return true;
    }
}