class Solution {
    public int numRookCaptures(char[][] board) {
        int x = 0, y = 0;

        // Find the rook's position
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    x = i;
                    y = j;
                    break;
                }
            }
        }

        int capture = 0;

        // Directions: top, bottom, right, left
        int[][] directions = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

        for (int[] dir : directions) {
            int nx = x + dir[0];
            int ny = y + dir[1];

            // Move in the current direction
            while (nx >= 0 && nx < board.length && ny >= 0 && ny < board[0].length) {
                char c = board[nx][ny];

                // If we encounter a piece
                if (Character.isLetter(c)) {
                    // If it's a pawn, increment capture and stop
                    if (c == 'p') {
                        capture++;
                    }
                    break;
                }

                // Move to next square in the direction
                nx += dir[0];
                ny += dir[1];
            }
        }

        return capture;
    }
}