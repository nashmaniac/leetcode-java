package leetcode;

import java.util.HashSet;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class leetcode_1304 {
    public int[] sumZero(int n) {
        int[] t = new int[n];

        if (n%2 == 1) {
          t[n-1] = 0;
          n-= 1;
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0;i<n;i++) {
            if (i%2 == 1) {
                t[i] = -t[i-1];
            } else {
                int nextNum = ThreadLocalRandom.current().nextInt(1, n);
                while (hashSet.contains(nextNum) && hashSet.contains(-nextNum) && nextNum != 0) {
                    nextNum = ThreadLocalRandom.current().nextInt(1, n);
                }
                t[i] = Math.abs(nextNum);
                hashSet.add(nextNum);
                hashSet.add(-nextNum);
            }
        }
        return t;
    }
    public static void main(String[] args) {
        leetcode_1304 t = new leetcode_1304();
        for(int i=0;i<1;i++) {
            int[] m = t.sumZero(42);
            for(int j=0;j<m.length;j++) {
                System.out.print(m[j]+" ");
            }
            System.out.println();
        }

    }
}
