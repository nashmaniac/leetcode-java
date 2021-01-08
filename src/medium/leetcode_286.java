package medium;

public class leetcode_286 {
    public void solve() {
        int[][] grid = new int[][]{{2147483647,-1,0,2147483647},{2147483647,2147483647,2147483647,-1},{2147483647,-1,2147483647,-1},{0,-1,2147483647,2147483647}};
        wallsAndGates(grid);
        for(int[] row: grid) {
            for(int col: row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    public void dfs(int[][] rooms, int row, int col, int val) {

        // constraints
        if(row < 0 || col < 0 || row >= rooms.length || col >= rooms[0].length) {
            return;
        }
        if(rooms[row][col] == -1) {
            return;
        }
        if(rooms[row][col] < val) {
            return;
        }
        // process cell
        rooms[row][col] = Math.min(rooms[row][col], val);
        // propagate
        dfs(rooms, row-1, col, rooms[row][col] + 1);
        dfs(rooms, row+1, col, rooms[row][col] + 1);
        dfs(rooms, row, col-1, rooms[row][col] + 1);
        dfs(rooms, row, col+1, rooms[row][col] + 1);

    }

    public void wallsAndGates(int[][] rooms) {
        for(int i=0;i<rooms.length;i++) {
            for(int j=0;j<rooms[0].length;j++) {
                if(rooms[i][j] == 0) {
                    dfs(rooms, i, j, rooms[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        leetcode_286 t = new leetcode_286();
        t.solve();
    }
}
