package leetcode.s1501_1600;

public class leetcode_1572 {

    public int diagonalSum(int[][] mat) {
        int rowCount = mat.length;
        int topRow = 0;
        int belowRow = rowCount-1;
        int c = 0;
        int sum = 0;
        while (topRow<rowCount && belowRow>-1) {
            sum += mat[topRow][c];
            if(topRow != belowRow) {
                sum+=mat[belowRow][c];
            }
            topRow++;
            c++;
            belowRow--;
        }
        return sum;
    }

    public static void main(String[] args) {
        leetcode_1572 t = new leetcode_1572();
    }
}
