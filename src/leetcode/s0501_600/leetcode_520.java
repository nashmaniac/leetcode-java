package leetcode.s0501_600;

public class leetcode_520 {

    public boolean isCaptial(char c) {
        int ch = (int) c;
        return (ch>=65 && ch<65+26);
    }

    public boolean detectCapitalUse(String word) {
        for(int i=0;i<word.length()-1;i++) {
            if(i>0 && isCaptial(word.charAt(i)) && !isCaptial(word.charAt(i-1))) {
                return false;
            }

            if(i!=0 && i>0 && !isCaptial(word.charAt(i)) && isCaptial(word.charAt(i-1))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        leetcode_520 t = new leetcode_520();
    }
}
