package leetcode.s01_100;

public class leetcode_74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) {
            return false;
        }
        int row = 0;
        while (row < matrix.length) {
            if(matrix[row][0] > target) {
                break;
            }
        }
        row--;
        for(int i=0;i<matrix[row].length;i++) {
            if(matrix[row][i] == target) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        leetcode_74 t = new leetcode_74();
    }
}
