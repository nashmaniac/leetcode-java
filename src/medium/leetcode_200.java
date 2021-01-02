package medium;

public class leetcode_200 {
    public void solve() {
    }

    public void dfs(char[][] grid, int r, int c) {
        int row = grid.length;
        int col = grid[0].length;
        if(r<0 || col < 0 || r>=row || c>=col || grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';
        dfs(grid, r+1, c);
        dfs(grid, r-1, c);
        dfs(grid, r, c+1);
        dfs(grid, r, c-1);
    }

    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                if(grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        leetcode_200 t = new leetcode_200();
        t.solve();
    }
}
