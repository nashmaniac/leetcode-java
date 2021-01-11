package medium;

public class leetcode_695 {
    public void solve() {

        int[][] grid = new int[][]{
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };

        System.out.println(maxAreaOfIsland(grid));
    }


    public int dfs(int[][] grid, int r, int c, int row, int col, int area) {
        if(r<0 || c<0 || r>= row || c>= col || grid[r][c] == 0) {
            return 0;
        }
        // process cell
        grid[r][c] = 0;

        int left = dfs(grid, r, c-1, row, col, area+1);
        int right = dfs(grid, r, c+1, row, col, area+1);
        int up = dfs(grid, r-1, c, row, col, area+1);
        int down = dfs(grid, r+1, c, row, col, area+1);

//        grid[r][c] = 1;
        return 1+left+right+up+down;
    }

    public int maxAreaOfIsland(int[][] grid) {
        if(grid.length == 0) {
            return 0;
        }

        int row = grid.length;
        int col = grid[0].length;
        int area = 0;
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                if(grid[i][j] == 1) {
                    int a = dfs(grid, i, j, row, col, 0);
//                    System.out.println(a);
                    area = Math.max(area, a);
                }
            }
        }
        return area;
    }

    public static void main(String[] args) {
        leetcode_695 t = new leetcode_695();
        t.solve();
    }
}
