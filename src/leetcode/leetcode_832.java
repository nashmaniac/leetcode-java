package leetcode;

public class leetcode_832 {

    public int[][] flipAndInvertImage(int[][] A) {
        for(int i=0;i<A.length;i++) {
            for(int j=0;j<A[i].length;j++) {
                if (j<A[i].length/2) {
                    int temp = A[i][j];
                    A[i][j] = A[i][A[i].length-1-j];
                    A[i][A[i].length-1-j] = temp;
                }
                if (A[i][j] == 0) {
                    A[i][j] = 1;
                } else {
                    A[i][j] = 0;
                }

            }
        }
        return A;
    }
    public static void main(String[] args) {
        leetcode_832 t = new leetcode_832();
        /**
         * 1 1 0
         * 1 0 1
         * 0 0 0
         * **/
        int[][] m = t.flipAndInvertImage(new int[][]{{1,1,0},{1,0,1},{0,0,0}});
        for (int[] b: m) {
            for(int c: b) {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
