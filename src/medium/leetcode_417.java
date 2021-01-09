package medium;

import java.util.ArrayList;
import java.util.List;

public class leetcode_417 {
    public void solve() {
    }

    public void dfs(int[][] matrix, int r, int c, int cellVal, boolean[][] dfsMap) {

        // constraint

        // safe cell
        if(r < 0 || c < 0 || r >= matrix.length || c>=matrix[0].length) {
            return;
        }

        if(dfsMap[r][c]) {
            return;
        }

        if(matrix[r][c]<cellVal) {
            return;
        }

        dfsMap[r][c] = true;
        dfs(matrix, r+1, c, matrix[r][c], dfsMap);
        dfs(matrix, r-1, c, matrix[r][c], dfsMap);
        dfs(matrix, r, c+1, matrix[r][c], dfsMap);
        dfs(matrix, r, c-1, matrix[r][c], dfsMap);

    }

    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        if(matrix.length == 0) {
            return new ArrayList<>();
        }

        int row = matrix.length;
        int col = matrix[0].length;
        boolean[][] pacificMap = new boolean[row][col];
        boolean[][] atlanticMap = new boolean[row][col];

        List<List<Integer>> arr = new ArrayList<>();


        for(int i=0;i<row;i++) {
            dfs(matrix, i, 0, Integer.MIN_VALUE, pacificMap);
            dfs(matrix, i, col-1, Integer.MIN_VALUE, atlanticMap);
        }

        for(int i=0;i<col;i++) {
            dfs(matrix, 0, i, Integer.MIN_VALUE, pacificMap);
            dfs(matrix, row-1, i, Integer.MIN_VALUE, atlanticMap);
        }


        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                if(pacificMap[i][j] && atlanticMap[i][j]) {
                    List<Integer> a = new ArrayList<>();
                    a.add(i);
                    a.add(j);
                    arr.add(a);
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        leetcode_417 t = new leetcode_417();
        t.solve();
    }
}
