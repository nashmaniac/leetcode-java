package leetcode.s0901_1000;

public class leetcode_941 {

    public boolean validMountainArray(int[] A) {
        int N = A.length;
        int i = 0;

        // walk up
        while (i+1 < N && A[i] < A[i+1])
            i++;

        // peak can't be first or last
        if (i == 0 || i == N-1)
            return false;

        // walk down
        while (i+1 < N && A[i] > A[i+1])
            i++;

        return i == N-1;
    }

    public static void main(String[] args) {
        leetcode_941 t = new leetcode_941();
        System.out.println(t.validMountainArray(new int[]{9,8,7,6,5,4,3,2,1,0}));
        System.out.println(t.validMountainArray(new int[]{0, 3, 2, 1}));
        System.out.println(t.validMountainArray(new int[]{3, 5, 5}));
    }
}
