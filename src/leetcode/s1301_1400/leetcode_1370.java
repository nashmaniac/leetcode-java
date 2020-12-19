package leetcode.s1301_1400;

import java.util.Arrays;

public class leetcode_1370 {

    public String sortString(String s) {
        int[] freq = new int[26];
        Arrays.fill(freq, 0);
        for(char c: s.toCharArray()) {
            freq[c-'a']++;
        }

        StringBuilder result = new StringBuilder();

        while (result.length()<s.length()) {
            for(int i=0;i< freq.length;i++) {
                if(freq[i]!=0) {
                    freq[i]--;
                    char c = (char)(i+'a');
                    result.append(c);
                }
            }
            for(int i=freq.length-1;i>=0;i--) {
                if(freq[i]!=0) {
                    freq[i]--;
                    char c = (char)(i+'a');
                    result.append(c);
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        leetcode_1370 t = new leetcode_1370();
    }
}
