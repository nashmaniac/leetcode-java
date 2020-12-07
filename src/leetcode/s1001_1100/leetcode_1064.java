package leetcode.s1001_1100;

public class leetcode_1064 {
    public int fixedPoint(int[] A) {
        for(int i=0;i<A.length;i++) {
            if(A[i] == i) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        leetcode_1064 t = new leetcode_1064();
    }
}
