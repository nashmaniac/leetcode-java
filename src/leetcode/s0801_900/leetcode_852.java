package leetcode.s0801_900;

public class leetcode_852 {
    public int peakIndexInMountainArray(int[] arr) {
        int index = 0;
        int elem = arr[0];
        for(int i=0;i<arr.length;i++) {
            if(arr[i]<elem) {
                return index;
            } else {
                index = i;
                elem = arr[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        leetcode_852 t = new leetcode_852();
    }
}
