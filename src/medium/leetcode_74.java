package medium;

public class leetcode_74 {
    public void solve() {
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) {
            return false;
        }
        int row = matrix.length-1;
        int col = 0;

        while (row>=0 && col<matrix[0].length) {
            if(target<matrix[row][col]) {
                row--;
            } else if(target > matrix[row][col]) {
                col++;
            } else {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        leetcode_74 t = new leetcode_74();
        t.solve();
    }
}
