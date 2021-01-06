package medium;

public class leetcode_34 {
    public void solve() {
    }


    public int[] searchRange(int[] nums, int target) {
        int[] a = new int[]{-1, -1};
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == target) {
                a[0] = i;
                break;
            }
        }
        if(a[0] == -1) {
            return a;
        }

        for(int i=nums.length-1;i>=0;i--) {
            if(nums[i] == target) {
                a[1] = i;
                break;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        leetcode_34 t = new leetcode_34();
        t.solve();
    }
}
