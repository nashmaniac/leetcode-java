package leetcode.s0101_200;

import java.util.LinkedList;
import java.util.Queue;

public class leetcode_200 {

    public void dfs(char[][] grid, int r, int c) {
        int row = grid.length;
        int col = grid[0].length;


        if(r>=row || c>=col || r<0 || c<0 || grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';
        dfs(grid, r+1, c);
        dfs(grid, r-1, c);
        dfs(grid, r, c+1);
        dfs(grid, r, c-1);
    }

    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) {
            return 0;
        }

        int count = 0;
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    public void solve() {

    }

    public static void main(String[] args) {
        leetcode_200 t = new leetcode_200();
        t.solve();
    }
}