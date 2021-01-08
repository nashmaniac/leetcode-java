package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_90 {
    public void solve() {
    }

    public void happyGirlHelper(List<List<Integer>> arr, List<Integer> curr, int[] nums, int index) {
        if(index == nums.length) {
            System.out.println(curr);
            arr.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[index]);

        happyGirlHelper(arr, curr, nums, index+1);

        curr.remove(curr.size()-1);

        while (index+1 < nums.length && nums[index] == nums[index+1]) {
            index++;
        }

        happyGirlHelper(arr, curr, nums, index+1);

    }


    public List<List<Integer>> happyGirlzt(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(nums);
        happyGirlHelper(arr, new ArrayList<>(), nums, 0);
        return arr;
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        return happyGirlzt(nums);
    }

    public static void main(String[] args) {
        leetcode_90 t = new leetcode_90();
        t.solve();
    }
}
