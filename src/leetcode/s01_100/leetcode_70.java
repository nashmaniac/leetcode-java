package leetcode.s01_100;

public class leetcode_70 {


    public int climbStairs(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        for(int i=3;i<n+1;i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n];
    }

    public static void main(String[] args) {
        leetcode_70 t = new leetcode_70();
        System.out.println(t.climbStairs(3));
    }
}
