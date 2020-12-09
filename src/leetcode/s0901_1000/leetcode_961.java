package leetcode.s0901_1000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leetcode_961 {

    public int repeatedNTimes(int[] A) {
        int maxValue = 0;
        int maxCount = 0;
        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();

        for(int i=0;i<A.length;i++) {
            countMap.put(A[i], countMap.getOrDefault(A[i], 0)+1);
            if(countMap.get(A[i]) > maxCount) {
                maxCount = countMap.get(A[i]);
                maxValue = A[i];
            }
        }
        return maxValue;
    }


    public static void main(String[] args) {
        leetcode_961 t = new leetcode_961();
        List<int[]> listArray = new ArrayList<>();
        listArray.add(new int[]{1,2,3,3});
        listArray.add(new int[]{2,1,2,5,3,2});
        listArray.add(new int[]{5,1,5,2,5,3,5,4});


        for(int[] a: listArray) {
            System.out.println(t.repeatedNTimes(a));
        }

    }
}
