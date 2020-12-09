package leetcode.s0501_600;

public class leetcode_551 {

    public boolean checkRecord(String s) {
        char[] c = s.toCharArray();
        int absent = 0;
        for(int i=0;i<c.length;i++) {
            if(c[i] == 'A') {
                absent++;
            }
            if(i <= s.length() - 3 && c[i] == 'L' && c[i+1] == 'L' && c[i+2] == 'L') {
                return false;
            }
        }
        return absent<2;
    }

    public static void main(String[] args) {
        leetcode_551 t = new leetcode_551();
    }
}
