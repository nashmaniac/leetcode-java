package leetcode.s1201_1300;

public class leetcode_1252 {
    public int oddCells(int n, int m, int[][] indices) {
        int[][] result = new int[n][m];

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                result[i][j] = 0;
            }
        }
        for(int k=0;k< indices.length;k++) {
            int row = indices[k][0];
            int col = indices[k][1];
            for(int i=0;i<m;i++) {
                result[row][i]++;
            }

            for(int i=0;i<n;i++) {
                result[i][col]++;
            }
        }
        int count = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if (result[i][j]%2 == 1) {
                    count++;
                }
            }
        }


        return count;
    }
    public static void main(String[] args) {
        leetcode_1252 t = new leetcode_1252();
    }
}
