package leetcode.s0701_800;

import java.util.HashMap;

public class leetcode_771 {

    public int numJewelsInStones(String J, String S) {
        int count = 0;
        HashMap<Character, Integer> hashMap= new HashMap<Character, Integer>();
        for(int i=0;i<S.length();i++) {
            if (hashMap.containsKey(S.charAt(i))) {
                hashMap.put(S.charAt(i), hashMap.get(S.charAt(i))+1);
            } else {
                hashMap.put(S.charAt(i), 1);
            }
        }

        for(int i=0;i<J.length();i++) {
            if(hashMap.containsKey(J.charAt(i))) {
                count += hashMap.get(J.charAt(i));
            }
        }
        return count;
    }
    public static void main(String[] args) {
        leetcode_771 t = new leetcode_771();
        System.out.println(t.numJewelsInStones("aA", "aAAbbbb"));
    }
}
