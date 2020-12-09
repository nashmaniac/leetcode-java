package leetcode.s001_100;

import java.util.HashMap;

public class leetcode_1 {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(hashMap.containsKey(target-nums[i])) {
                return new int[]{hashMap.get(target-nums[i]), i};
            }

            hashMap.put(target-nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        leetcode_1 t = new leetcode_1();
    }
}
