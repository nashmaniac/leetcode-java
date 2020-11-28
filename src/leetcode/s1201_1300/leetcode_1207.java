package leetcode.s1201_1300;

import java.util.HashMap;
import java.util.HashSet;

public class leetcode_1207 {

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0;i<arr.length;i++) {
            if(hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], hashMap.get(arr[i])+1);
            } else {
                hashMap.put(arr[i], 0);
            }
        }

        for(Integer i: hashMap.values()) {
            if(hashSet.contains(i)) {
                return false;
            }
            hashSet.add(i);
        }

        return true;

    }

    public static void main(String[] args) {
        leetcode_1207 t = new leetcode_1207();
    }
}
