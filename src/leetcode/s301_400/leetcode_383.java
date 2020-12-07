package leetcode.s301_400;

import java.util.HashMap;

public class leetcode_383 {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> a = new HashMap<>();
        for(Character c: magazine.toCharArray()) {
            a.put(c, a.getOrDefault(c, 0)+1);
        }

        for(Character c: ransomNote.toCharArray()) {
            if(!a.containsKey(c)) {
                return false;
            }
            if(a.get(c) == 0) {
                return false;
            }
            a.put(c, a.get(c)-1);
        }
        return true;

    }

    public static void main(String[] args) {
        leetcode_383 t = new leetcode_383();
    }
}
