package leetcode.s0501_600;

public class leetcode_509 {

    public int fib(int N) {


        if(N == 0) {
            return 0;
        }
        if (N== 1) {
            return 1;
        }
        int[] arr = new int[N+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2;i<N+1;i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[N];
    }

    public static void main(String[] args) {
        leetcode_509 t = new leetcode_509();
    }
}
