package leetcode.s0201_300;

import java.util.HashMap;

public class leetcode_266 {

    public boolean canPermutePalindrome(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        for(Character c: s.toCharArray()) {
            h.put(c, h.getOrDefault(c, 0)+1);
        }
        int[] a = new int[2];
        for(int i=0;i<2;i++) {
            a[i] = 0;
        }
        for(Integer i: h.values()) {
            a[i%2] += 1;
        }

        if(s.length() % 2 == 1) {
            if(a[1] != 1) {
                return false;
            } else {
                return true;
            }
        } else {
            if(a[1] != 0) {
                return false;
            } else {
                return true;
            }
        }
    }

    public static void main(String[] args) {
        leetcode_266 t = new leetcode_266();
    }
}
