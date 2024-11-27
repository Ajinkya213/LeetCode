class Solution {
    public int numRookCaptures(char[][] board) {
        int x = 0;
        int y = 0;
        boolean found = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    x = i;
                    y = j;
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        int capture = 0;
        // Looking at the top
        for (int i = x - 1; i >= 0; i--) {
            char c = board[i][y];
            if (Character.isLetter(c)) {
                if (c == 'p') {
                    capture++;
                }
                break;
            }
        }

        // Looking at the bottom
        for (int i = x + 1; i < board.length; i++) {
            char c = board[i][y];
            if (Character.isLetter(c)) {
                if (c == 'p') {
                    capture++;
                }
                break;
            }
        }

        // Looking at the right
        for (int j = y + 1; j < board[0].length; j++) {
            char c = board[x][j];
            if (Character.isLetter(c)) {
                if (c == 'p') {
                    capture++;
                }
                break;
            }
        }

        // Looking at the left
        for (int j = y - 1; j >= 0; j--) {
            char c = board[x][j];
            if (Character.isLetter(c)) {
                if (c == 'p') {
                    capture++;
                }
                break;
            }
        }

        return capture;
    }
}