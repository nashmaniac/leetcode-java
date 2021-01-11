package medium;

public class leetcode_33 {
    public void solve() {
    }


    public int findRotationIndex(int[] nums, int left, int right) {
        if(nums[left] < nums[right]) {
            return 0;
        }
        while (left <= right) {
            int pivot = left+(right-left)/2;

            if(nums[pivot] > nums[pivot+1]){
                return pivot + 1;
            } else {
                if(nums[left] < nums[pivot]) {
                    left = pivot + 1;
                } else {
                    right = pivot - 1;
                }
            }
        }
        return 0;
    }


    public int search(int[] nums, int target, int left, int right) {
        while (left <= right) {
            int pivot = left + (right-left)/2;
            if(nums[pivot] == target) {
                return pivot;
            } else {
                if(nums[pivot] > target){
                    right = pivot -1;
                } else {
                    left = pivot + 1;
                }
            }
        }
        return -1;
    }


    public int search(int[] nums, int target) {
        if(nums.length == 0) {
            return -1;
        }

        if(nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int n = nums.length;
        int rotationIndex = findRotationIndex(nums, 0, n-1);

        if(nums[rotationIndex] == target) {
            return rotationIndex;
        }

        if(nums[0]>target) {
            return search(nums, target, rotationIndex, n-1);
        }

        return search(nums, target, 0, rotationIndex);
    }


    public static void main(String[] args) {
        leetcode_33 t = new leetcode_33();
        t.solve();
    }
}
