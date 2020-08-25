package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode_1389 {

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> t = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            t.add(index[i], nums[i]);
        }
        return t.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) {
        leetcode_1389 t = new leetcode_1389();
        System.out.println(t.createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1}));
    }
}
