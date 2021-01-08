package medium;

public class leetcode_31 {
    public void solve() {
    }

    public void nextPermutation(int[] nums) {

        // find the decresing sequence
        int n = nums.length-1;
        int j = n;
        while (j>=0 && nums[j] >= nums[j-1]) {
            j--;
        }
        int i = n;
        while (i>=0 && nums[i]<nums[j]) {
            i--;
        }
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j] = temp;

        j++;
        while (j<=n) {
            temp = nums[j];
            nums[j] = nums[n];
            nums[n] = temp;
            j++;
            n--;
        }

    }


    public static void main(String[] args) {
        leetcode_31 t = new leetcode_31();
        t.solve();
    }
}
