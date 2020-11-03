package leetcode.s1301_1400;

import java.util.ArrayList;
import java.util.List;

public class leetcode_1313 {

    public int[] decompressRLElist(int[] nums) {
        List<Integer> t = new ArrayList<Integer>();
        for(int i=0;i<nums.length-1;i=i+2) {
            int freq = nums[i];
            int value = nums[i+1];
            for(int j=0;j<freq;j++) {
                t.add(value);
            }
        }
        return t.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) {
        leetcode_1313 t = new leetcode_1313();
        System.out.print(t.decompressRLElist(new int[]{1, 2, 3, 4}));
    }
}
