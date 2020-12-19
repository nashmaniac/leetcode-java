package leetcode.s1601_1700;

import java.util.HashSet;

public class leetcode_1684 {

    public int countConsistentStrings(String allowed, String[] words) {
        int count = words.length;
        HashSet<Character> hashSet = new HashSet<>();
        for(Character c: allowed.toCharArray()) {
            hashSet.add(c);
        }
        for(int i=0;i< words.length;i++) {
            for(int j=0;j<words[i].length();j++) {
                if(!hashSet.contains(words[i].charAt(j))) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        leetcode_1684 t = new leetcode_1684();
    }
}
