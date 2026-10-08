class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Check rows, columns, and 3x3 boxes
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                // Ignore empty cells
                if (board[row][col] == '.') {
                    continue;
                }

                int num = board[row][col] - '1';

                // Find which 3x3 box this cell belongs to
                int box = (row / 3) * 3 + (col / 3);

                // Check for duplicate
                if (rows[row][num] ||
                    cols[col][num] ||
                    boxes[box][num]) {
                    return false;
                }

                // Mark the number as used
                rows[row][num] = true;
                cols[col][num] = true;
                boxes[box][num] = true;
            }
        }

        return true;
    }
}
