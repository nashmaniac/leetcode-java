package easy;

public class leetcode_88 {
    public void solve() {
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = nums1.length-1;
        int p1 = m-1;
        int p2 = n-1;
        while ((p1>=0) && (p2>=0)) {
            nums1[l--] = (nums1[p1]<nums2[p2]) ? nums2[p2--] : nums1[p1--];
        }
        System.arraycopy(nums2, 0, nums1, 0, p2+1);
    }

    public static void main(String[] args) {
        leetcode_88 t = new leetcode_88();
        t.solve();
    }
}
