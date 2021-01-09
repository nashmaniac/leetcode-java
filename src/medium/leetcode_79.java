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


    public boolean dfs(char[][] board, int r, int c, StringBuilder s, String word, int index) {
        // constraint
        if(s.toString().equals(word)) {
//            System.out.println(s.toString());
            return true;
        }
        if(r<0 || c<0 || r>=board.length || c>=board[0].length) {
            return false;
        }

        if(index >= word.length()) {
            return false;
        }
        if(board[r][c] != word.charAt(index)) {
            return false;
        }

        s.append(board[r][c]);
        char ch = board[r][c];

        board[r][c] = '#';


        boolean down = dfs(board, r+1, c, s, word, index+1);
        boolean up = dfs(board, r-1, c, s, word, index+1);
        boolean right = dfs(board, r, c+1, s, word, index+1);
        boolean left = dfs(board, r, c-1, s, word, index+1);

        board[r][c] = ch;
        s.deleteCharAt(s.length()-1);

        return (left || right || up || down);
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

//        dfs(board, 1, 1, new StringBuilder(), word, 0);

        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                if(board[i][j] == word.charAt(0)) {
                    boolean status = dfs(board, i, j, new StringBuilder(), word, 0);
                    if(status) {
                        return status;
                    }
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        leetcode_79 t = new leetcode_79();
        t.solve();
    }
}
