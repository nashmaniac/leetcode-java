package leetcode.s1101_1200;

public class leetcode_1180 {

    public int countLetters(String S) {
        int res = 1;
        int count = 1;
        for(int i=1;i<S.length();i++) {
            if(S.charAt(i) == S.charAt(i-1)) {
                count++;
            } else {
                count = 1;
            }
            res += count;
        }
        return res;
    }

    public static void main(String[] args) {
        leetcode_1180 t = new leetcode_1180();
    }
}
