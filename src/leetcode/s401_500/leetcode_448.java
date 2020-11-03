package leetcode.s401_500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> a  = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            int current = Math.abs(nums[i]);
            nums[current-1] = - Math.abs(nums[current-1]);
        }

        for(int i=0;i<nums.length;i++) {
            if(nums[i] > 0){
                a.add(i+1);
            }
        }
        return a;
    }

    public static void main(String[] args) {
        leetcode_448 t = new leetcode_448();
    }
}
