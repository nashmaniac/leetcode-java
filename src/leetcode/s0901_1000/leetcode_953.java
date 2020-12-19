package leetcode.s0901_1000;

public class leetcode_953 {

    public boolean isSorted(String word1, String word2, int[] o) {
        for(int i=0;i<Math.min(word1.length(), word2.length());i++) {
            if(word1.charAt(i)!=word2.charAt(i)) {
                if(o[word1.charAt(i)-'a'] > o[word2.charAt(i)-'a']) {
                    return false;
                }
            }
        }
        if(word1.length()>word2.length()) {
            return false;
        }
        return true;
    }


    public boolean isAlienSorted(String[] words, String order) {
        int[] o = new int[26];

        for(int i=0;i<o.length;i++) {
            o[order.charAt(i)-'a'] = i;
        }
        for(int i=0;i<words.length-1;i++) {
            return isSorted(words[i], words[i+1], o);
        }
        return true;
    }



    public static void main(String[] args) {
        leetcode_953 t = new leetcode_953();
    }
}
