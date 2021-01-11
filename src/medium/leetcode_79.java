package medium;

public class leetcode_79 {
    public void solve() {
        char[][] board = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        exist(board, word);

        board = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        word = "SEE";
        exist(board, word);

        board = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        word = "ABCB";
        exist(board, word);

        board = new char[][]{{'C', 'A', 'A'}, {'A', 'A', 'A'}, {'B', 'C', 'D'}};
        word = "AAB";
        exist(board, word);
    }


    public boolean dfs(char[][] board, int r, int c, String word, int index) {
        if(r<0 || c<0 || r>=board.length || c>=board[0].length) {
            return false;
        }

        if(index >= word.length()) {
            return true;
        }
        if(board[r][c] != word.charAt(index)) {
            return false;
        }
        char ch = board[r][c];

        board[r][c] = '#';

        int[] x = new int[] {-1, 1, 0, 0};
        int[] y = new int[] {0, 0, 1, -1};
        boolean ret = false;
        for(int i=0;i<x.length;i++) {
            ret = dfs(board, r+x[i], c+y[i], word, index+1);
            if(ret) {
                break;
            }
        }
        board[r][c] = ch;
        return ret;
    }


    public boolean exist(char[][] board, String word) {
        if(board.length == 0) {
            return false;
        }

        if(word.isEmpty()) {
            return false;
        }
        int row = board.length;
        int col = board[0].length;

        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                if(board[i][j] == word.charAt(0)) {
                    boolean status = dfs(board, i, j, word, 0);
                    if(status) {
                        return status;
                    }
                }
            }
        }
        return false;
    }


    public static void m31ain(String[] args) {
        leetcode_79 t = new leetcode_79();
        t.solve();
    }
}
