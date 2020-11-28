package leetcode.s301_400;

import java.util.HashSet;

public class leetcode_389 {

    public char findTheDifference(String s, String t) {
        int[] a = new int[26];
        int[] b = new int[26];

        for(int i=0;i<s.length();i++) {
            a[s.charAt(i)-'a']++;
            b[t.charAt(i)-'a']++;
        }
        b[t.charAt(t.length()-1)-'a']++;
        for(int i=0;i<a.length;i++) {
            if(a[i]!=b[i]) {
                char c = (char) (i+'a');
                return c;
            }
        }

        return '!';
    }

    public static void main(String[] args) {
        leetcode_389 t = new leetcode_389();
    }
}
