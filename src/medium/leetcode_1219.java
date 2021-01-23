package medium;

public class leetcode_1219 {
    public void solve() {
    }

    public int dfs(int[][] grid, int r, int c, int ans) {
        if(r<0 || c<0 || r>=grid.length || c>= grid[0].length || grid[r][c] == 0) {
            return ans;
        }

        int val = grid[r][c];
        grid[r][c] = 0;

        int left = dfs(grid, r, c-1, 0);
        int right = dfs(grid, r, c+1, 0);
        int up = dfs(grid, r-1, c, 0);
        int down = dfs(grid, r+1, c, 0);


        grid[r][c] = val;
        return val + Math.max(Math.max(left, right), Math.max(up, down));

    }

    public int getMaximumGold(int[][] grid) {
        if(grid.length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++){
                if(grid[i][j] > 0) {
                    count = Math.max(count, dfs(grid, i, j, 0));
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        leetcode_1219 t = new leetcode_1219();
        t.solve();
    }
}
