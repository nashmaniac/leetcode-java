package medium;

public class leetcode_31 {
    public void solve() {
        int[][] nums = new int[][]{
                {3, 2, 1},
                {1, 1, 5},
                {1},
                {1, 2, 3},
                {1, 5, 8, 4, 7, 6, 5, 3, 1},
                {1, 5, 1}
        };

        for(int[] n: nums) {
            nextPermutation(n);
            for(int i: n) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }


    public void swap(int[] nums, int i, int  j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 1;

        while (i>0 && nums[i]<=nums[i-1]) {
            i--;
        }
//        System.out.println(i);
        if(i>=0) {
            int j = n-1;
            while (i<j && nums[i]<=nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }

        reverse(nums, i+1, n-1);

    }


    public static void main(String[] args) {
        leetcode_31 t = new leetcode_31();
        t.solve();
    }
}
