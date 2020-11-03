package leetcode.s01_100;

public class leetcode_88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = nums1.length-1;

        while (n>0) {
            if(nums1[m-1] > nums2[n-1]) {
                nums1[index] = nums1[m-1];
                m--;
            } else {
                nums1[index] = nums2[n-1];
                n--;
            }
            index--;
        }

        
    }

    public static void main(String[] args) {
        leetcode_88 t = new leetcode_88();

//        t.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
        t.merge(new int[]{0}, 0, new int[]{1}, 1);
    }
}
