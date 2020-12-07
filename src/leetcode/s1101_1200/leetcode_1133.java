package leetcode.s1101_1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class leetcode_1133 {

    public int largestUniqueNumber(int[] A) {
        HashMap<Integer, Integer> a = new HashMap<>();
        for(int i=0;i<A.length;i++) {
            a.put(A[i], a.getOrDefault(A[i], 0)+1);
        }

        ArrayList<Integer> b = new ArrayList<>();
        for(Map.Entry<Integer, Integer> d: a.entrySet()) {
            if(d.getValue() == 1) {
                b.add(d.getKey());
            }
        }
        if(b.size() == 0) {
            return -1;
        }
        int[] c = new int[b.size()];
        for(int i=0;i<c.length;i++) {
            c[i] = b.get(i);
        }
        Arrays.sort(c);
        return c[c.length-1];
    }

    public static void main(String[] args) {
        leetcode_1133 t = new leetcode_1133();
    }
}
