package leetcode.s901_1000;

public class leetcode_999 {

    public int numRookCaptures(char[][] board) {
        int count = 0;
        int row = board.length;
        int col = board[0].length;
        int i = 0, j = 0;

        for(int i1=0;i1<row;i1++) {
            for(int j1=0;j1<col;j1++) {
                if(board[i1][j1] == 'R') {
                    i = i1;
                    j = j1;
                    break;
                }
            }
        }
        // up
        int r = i-1;
        while(r>=0) {
            if(board[r][j] == 'p') {
                count++;
                break;
            }
            if(board[r][j]!='.') {
                break;
            }
            r--;
        }

        r = i+1;
        while(r<row) {
            if(board[r][j] == 'p') {
                count++;
                break;
            }
            if(board[r][j]!='.') {
                break;
            }
            r++;
        }

        int c = j-1;
        while(c>=0) {
            if(board[i][c] == 'p') {
                count++;
                break;
            }
            if(board[i][c]!='.') {
                break;
            }
            c--;
        }


        c = j+1;
        while(c<col) {
            if(board[i][c] == 'p') {
                count++;
                break;
            }
            if(board[i][c]!='.') {
                break;
            }
            c++;
        }
        return count;
    }
    
    public void solve() {
        char[][] a = new char[][] {
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','R','.','.','.','p'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'}
        };
        numRookCaptures(a);

    }

    public static void main(String[] args) {
        leetcode_999 t = new leetcode_999();
        t.solve();
    }
}
