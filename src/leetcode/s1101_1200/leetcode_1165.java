package leetcode.s1101_1200;

import java.util.HashMap;

public class leetcode_1165 {

    public int calculateTime2(String keyboard, String word) {

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i=0;i<keyboard.length();i++) {
            hashMap.put(keyboard.charAt(i), i);
        }
        int lastIndex = hashMap.get(word.charAt(0));
        int count = hashMap.get(word.charAt(0));
        for(int i=1;i<word.length();i++) {
            count += Math.abs(hashMap.get(word.charAt(i))-lastIndex);
            lastIndex = hashMap.get(word.charAt(i));
        }
        return count;

    }
    public int calculateTime(String keyboard, String word) {

        int lastIndex = keyboard.indexOf(word.charAt(0));
        int count = keyboard.indexOf(word.charAt(0));
        for(int i=1;i<word.length();i++) {
            count += Math.abs(keyboard.indexOf(word.charAt(i))-lastIndex);
            lastIndex = keyboard.indexOf(word.charAt(i));
        }
        return count;

    }


    public static void main(String[] args) {
        leetcode_1165 t = new leetcode_1165();
    }
}
