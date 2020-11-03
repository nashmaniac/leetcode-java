package leetcode.s01_100;

import java.util.HashSet;

public class leetcode_26 {

    public int removeDuplicates(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        int count = 0;
        for(int i=0;i<nums.length;i++) {
            if(!h.contains(nums[i])) {
                h.add(nums[i]);
                nums[count++] = nums[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        leetcode_26 t = new leetcode_26();
        System.out.println(t.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
