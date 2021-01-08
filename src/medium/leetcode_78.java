package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_78 {
    public void solve() {

        subsets(new int[] {1, 2, 3});
    }

    public void cascadingHelper(List<List<Integer>> arr, int[] nums) {
        for(int i=0;i<nums.length;i++) {
            List<List<Integer>> newSubset = new ArrayList<>();
            for(List<Integer> a: arr) {
                newSubset.add(new ArrayList<>(a));
                newSubset.get(newSubset.size()-1).add(nums[i]);
            }

            for(List<Integer> o: newSubset) {
                System.out.println(o);
                arr.add(o);
            }
        }
    }

    public List<List<Integer>> cascading(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>());
        cascadingHelper(arr, nums);
        return arr;
    }

    public List<List<Integer>> subsets(int[] nums) {
//        return cascading(nums);
        return happyGirlzt(nums);
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

        happyGirlHelper(arr, curr, nums, index+1);

    }


    public List<List<Integer>> happyGirlzt(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        happyGirlHelper(arr, new ArrayList<>(), nums, 0);
        return arr;
    }



    public static void main(String[] args) {
        leetcode_78 t = new leetcode_78();
        t.solve();
    }
}
