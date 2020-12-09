package leetcode.s001_100;

public class leetcode_69 {

    public int mySqrt(int x) {
        int[] arr = new int[x/2];
        for(int i=1;i<(x/2)+1;i++) {
            arr[i-1] = i;
        }
        int start = 0;
        int end = arr.length-1;
        while (start>end) {
            int mid = start + (end-start)/2;
            if(arr[mid]*arr[mid]<=x){
                return arr[mid];
            }

            if(arr[mid]*arr[mid] > x) {
                start = mid-1;
            } else {
                start = mid+1;
            }
        }
        return 1;
    }

    public void solve() {
        System.out.println(mySqrt(4));
    }

    public static void main(String[] args) {
        leetcode_69 t = new leetcode_69();
        t.solve();
    }
}
