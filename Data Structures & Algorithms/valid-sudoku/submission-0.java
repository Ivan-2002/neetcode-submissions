class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set<String> seen = new HashSet<>();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                char c = board[row][col];
                if (c == '.') continue;

                int box = (row / 3) * 3 + (col / 3);

                if (!seen.add(c + " in row " + row) ||
                    !seen.add(c + " in col " + col) ||
                    !seen.add(c + " in box " + box)) {
                    return false;
                }
            }
        }

        return true;
    }
}
