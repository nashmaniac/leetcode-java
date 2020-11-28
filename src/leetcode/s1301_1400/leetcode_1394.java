package leetcode.s1301_1400;

import java.util.HashMap;

public class leetcode_1394 {

    public int findLucky(int[] arr) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0)+1);
        }
        Integer count = null;
        for(Integer i: hashMap.keySet()) {
            if(i==hashMap.get(i)) {
                if(count == null) {
                    count = i;
                }
                if(i>count) {
                    count = i;
                }
            }
        }
        return count == null ? -1 : count;
    }
    public static void main(String[] args) {
        leetcode_1394 t = new leetcode_1394();
    }
}
