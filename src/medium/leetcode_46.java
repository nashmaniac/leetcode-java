package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leetcode_46 {
    public void solve() {
        permute(new int[] {1, 2, 3});
    }

    // Happygirltz implementation
    /**
     * keeping a status array and tweaking the status
     * */


    public void helper(List<List<Integer>> res, List<Integer> curr, int[] nums, boolean[] status) {
        if(curr.size() == nums.length) {
            System.out.println(curr);
            res.add(curr);
            return;
        }

        for(int i=0;i<nums.length;i++) {
            if(status[i]) continue;
            curr.add(nums[i]);
            status[i] = true;
            helper(res, curr, nums, status);
            curr.remove(curr.size()-1);
            status[i] = false;
        }
    }

    public List<List<Integer>> happyGirlzt(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] status = new boolean[nums.length];
        for(int i=0;i<status.length;i++) {
            status[i] = false;
        }

        helper(res, new ArrayList<>(), nums, status);
        return res;
    }

    public void helper(List<List<Integer>> res, ArrayList<Integer> nums, int first) {
        if(first == nums.size()) {
            System.out.println(nums);
            res.add(new ArrayList<Integer>(nums));
            return;
        }
        for(int i=first;i<nums.size();i++) {
            Collections.swap(nums, first, i);
            helper(res, nums, first+1);
            Collections.swap(nums, first, i);
        }

    }

    public List<List<Integer>> leetCodeSolution(int[] nums) {
        ArrayList<Integer> n = new ArrayList<>();
        for(int a: nums) {
            n.add(a);
        }
        List<List<Integer>> res = new ArrayList<>();
        helper(res, n, 0);
        return res;
    }



    public List<List<Integer>> permute(int[] nums) {
        return happyGirlzt(nums);
//        return leetCodeSolution(nums);
    }

    public static void main(String[] args) {
        leetcode_46 t = new leetcode_46();
        t.solve();
    }
}
