package leetcode.s0701_800;

import java.util.HashMap;

public class leetcode_760 {

    public int[] anagramMappings(int[] A, int[] B) {
        int[] target = new int[A.length];

        // alternate can be used
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0;i<B.length;i++) {
            hashMap.put(B[i], i);
        }


        for(int i=0;i<A.length;i++) {
            target[i] = hashMap.get(A[i]);
        }
        return target;
    }

    public static void main(String[] args) {
        leetcode_760 t = new leetcode_760();
    }
}
