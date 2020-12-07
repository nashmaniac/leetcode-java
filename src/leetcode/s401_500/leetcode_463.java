package leetcode.s401_500;

public class leetcode_463 {

    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                int up = 0, down=0, left=0, right=0;
                if(i==0) {
                    up = 0;
                } else if(grid[i-1][j] == 1) {
                    up = 1;
                }
                if(i==row-1) {
                    down = 0;
                } else if(grid[i+1][j] == 1) {
                    down = 1;
                }
                if(j==0) {
                    left = 0;
                } else if(grid[i][j-1] == 1) {
                    left = 1;
                }
                if(j==col-1) {
                    right = 0;
                } else if(grid[i][j+1] == 1) {
                    right = 1;
                }
                count+=(4-(up+down+right+left));
            }
        }
        return count;
    }

    public static void main(String[] args) {
        leetcode_463 t = new leetcode_463();
    }
}
