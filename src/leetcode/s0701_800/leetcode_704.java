package leetcode.s0701_800;

public class leetcode_704 {

    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length-1);
    }


    public int search(int[] nums, int target, int start, int end) {
        int mid = start+((end-start)/2);
        if(nums[mid] == target) {
            return mid;
        } else {
            if(start>= end) {
                return -1;
            }
            if(nums[mid] < target) {
                return search(nums, target, mid+1, end);
            }
            else{
                return search(nums, target, start, mid-1);
            }
        }
    }

    public void solve() {
        System.out.println(search(new int[]{2, 5}, 5));
    }



    public static void main(String[] args) {
        leetcode_704 t = new leetcode_704();
        t.solve();
    }
}
