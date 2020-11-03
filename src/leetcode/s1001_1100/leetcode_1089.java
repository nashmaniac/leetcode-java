package leetcode.s1001_1100;

public class leetcode_1089 {

    public void duplicateZeros(int[] arr) {
        int size = arr.length;
        int start = 0;
        while (start<size) {
            if(arr[start] == 0 && start<size-1) {
                for(int i=size-2;i>start;i--) {
                    arr[i+1] = arr[i];
                }
                arr[start+1] = 0;
                start += 2;
            } else {
                start+=1;
            }

        }
    }

    public static void main(String[] args) {
        leetcode_1089 t = new leetcode_1089();
        t.duplicateZeros(new int[]{1,0,2,3,0,4,5,0});
    }
}
