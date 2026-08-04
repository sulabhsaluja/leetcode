class Solution {
    public int countBattleships(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'X') {
                    count++;
                    dfs(board, i, j, rows, cols);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] board, int i, int j, int rows, int cols) {
        if (i < 0 || i >= rows || j < 0 || j >= cols || board[i][j] != 'X') {
            return;
        }

        board[i][j] = '.'; // mark visited

        dfs(board, i + 1, j, rows, cols); // down
        dfs(board, i - 1, j, rows, cols); // up
        dfs(board, i, j + 1, rows, cols); // right
        dfs(board, i, j - 1, rows, cols); // left
    }
}