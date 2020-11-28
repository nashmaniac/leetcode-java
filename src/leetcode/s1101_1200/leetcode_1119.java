package leetcode.s1101_1200;

import java.util.HashSet;

public class leetcode_1119 {

    public String removeVowels(String S) {
        StringBuilder s = new StringBuilder();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        HashSet<Character> hashSet = new HashSet<>();
        for(int i=0;i< vowels.length;i++){
            hashSet.add(vowels[i]);
        }

        for(Character c: S.toCharArray()) {
            if(!hashSet.contains(c)) {
                s.append(c);
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        leetcode_1119 t = new leetcode_1119();
    }
}
