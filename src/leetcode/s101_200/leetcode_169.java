package leetcode.s101_200;

import java.util.HashMap;

public class leetcode_169 {

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            h.put(nums[i], h.getOrDefault(nums[i], 0)+1);
        }

        for(Integer i: h.keySet()) {
            if(h.get(i)>Math.floor(nums.length/2)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        leetcode_169 t = new leetcode_169();
    }
}
