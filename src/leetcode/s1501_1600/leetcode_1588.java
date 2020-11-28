package leetcode.s1501_1600;

public class leetcode_1588 {

    public int sumOddLengthSubarrays(int[] arr) {
        int count = 0;

        // return sum array
        for(int i=0;i<arr.length;i++) {
            count+=arr[i];
        }

        for(int i=3;i<arr.length+1;i=i+2) {
            for(int j=0;j<arr.length;j++) {
                if(j+i-1 < arr.length) {
                    for(int k=j;k<=j+i-1;k++) {
                        count+=arr[k];
                    }
                }
            }


        }
        return count;
    }

    public void solve() {
        int[] arr = new int[]{1,4,2,5,3};
        sumOddLengthSubarrays(arr);
    }

    public static void main(String[] args) {
        leetcode_1588 t = new leetcode_1588();
        t.solve();
    }
}
