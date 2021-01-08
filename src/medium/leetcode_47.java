package medium;

import java.util.*;

public class leetcode_47 {
    public void solve() {
        permuteUnique(new int[] {1, 1, 2});
    }

    public void helper(List<List<Integer>> res, List<Integer> curr, int[] nums, boolean[] status) {

        if(curr.size() == nums.length) {
            System.out.println(curr);
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0;i< nums.length;i++) {
            if(status[i]) continue;
            if(i>0 && nums[i] == nums[i-1] && !status[i-1]) continue;

            curr.add(nums[i]);
            status[i] = true;

            helper(res, curr, nums, status);

            curr.remove(curr.size()-1);
            status[i] = false;
        }

    }

    public List<List<Integer>> happyGirlzt(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        boolean[] status = new boolean[nums.length];
        Arrays.sort(nums);
        for(int i=0;i<status.length;i++) {
            status[i] = false;
        }

        helper(arr, new ArrayList<>(), nums, status);
        return arr;
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
//        return happyGirlzt(nums);
        return leetcodeSolution(nums);
    }

    public void helper(List<List<Integer>> res, List<Integer> comb, HashMap<Integer, Integer> count, int n) {
        if(comb.size() == n) {
            System.out.println(comb);
            res.add(new ArrayList<>(comb));
            return;
        }

        for(Map.Entry<Integer, Integer> map: count.entrySet()) {
            Integer c = map.getValue();
            Integer num = map.getKey();
            if(c == 0) {
                continue;
            }

            comb.add(num);
            count.put(num, c-1);
            helper(res, comb, count, n);

            comb.remove(comb.size()-1);
            count.put(num, c);
        }
    }


    public List<List<Integer>> leetcodeSolution(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int num: nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> comb = new LinkedList<>();
        helper(arr, comb, count, nums.length);
        return arr;
    }

    public static void main(String[] args) {
        leetcode_47 t = new leetcode_47();
        t.solve();
    }
}
