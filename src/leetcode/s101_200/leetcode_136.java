package leetcode.s101_200;

import java.util.HashSet;

public class leetcode_136 {

    public int singleNumber(int[] nums) {
        int sumOfSet = 0, sumofNums = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        for(int a: nums) {
            if(!hashSet.contains(a)) {
                hashSet.add(a);
                sumOfSet += a;
            }

            sumofNums += a;
        }

        return 2*sumOfSet - sumofNums;


    }


    public static void main(String[] args) {
        leetcode_136 t = new leetcode_136();
    }
}
