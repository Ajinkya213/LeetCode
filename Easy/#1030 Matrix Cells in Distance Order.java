class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {

        List<int[]> cellOrder = new ArrayList<>();


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cellOrder.add(new int[]{i, j, Math.abs(i - rCenter) + Math.abs(j - cCenter)});
            }
        }


        cellOrder.sort((a, b) -> a[2] - b[2]);


        int[][] result = new int[rows * cols][2];
        for (int i = 0; i < cellOrder.size(); i++) {
            result[i][0] = cellOrder.get(i)[0];
            result[i][1] = cellOrder.get(i)[1];
        }

        return result;
    }
}