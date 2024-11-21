class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int mapped[][] = new int[m][n];

        // Mapping guards
        for (int i = 0; i < guards.length; i++) {
            mapped[guards[i][0]][guards[i][1]]++;
        }

        // Mapping walls
        for (int i = 0; i < walls.length; i++) {
            mapped[walls[i][0]][walls[i][1]] = 2;
        }

        // to mark gaurded passages
        for (int i = 0; i < mapped.length; i++) {
            for (int j = 0; j < mapped[i].length; j++) {

                // check left
                if (j > 0 && mapped[i][j] == 1) {
                    int lIndex = j - 1;
                    while (lIndex >= 0) {
                        if (mapped[i][lIndex] != 2 && mapped[i][lIndex] != 1) {
                            mapped[i][lIndex] = 9;
                        } else {
                            break;
                        }
                        lIndex--;
                    }
                }

                // check right
                if (j < n && mapped[i][j] == 1) {
                    int rIndex = j + 1;
                    while (rIndex < n) {
                        if (mapped[i][rIndex] != 2 && mapped[i][rIndex] != 1) {
                            mapped[i][rIndex] = 9;
                        } else {
                            break;
                        }
                        rIndex++;
                    }
                }

                // check top

                if (i > 0 && mapped[i][j] == 1) {
                    int tIndex = i - 1;
                    while (tIndex >= 0) {
                        if (mapped[tIndex][j] != 2 && mapped[tIndex][j] != 1) {
                            mapped[tIndex][j] = 9;
                        } else {
                            break;
                        }
                        tIndex--;
                    }
                }

                // check bottom

                if (i < m && mapped[i][j] == 1) {
                    int bIndex = i + 1;
                    while (bIndex < m) {
                        if (mapped[bIndex][j] != 2 && mapped[bIndex][j] != 1) {
                            mapped[bIndex][j] = 9;
                        } else {
                            break;
                        }
                        bIndex++;
                    }
                }
            }
        }

        int count = 0;

        // For printing
        for (int[] sect : mapped) {
            for (int ele : sect) {
                if (ele == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}