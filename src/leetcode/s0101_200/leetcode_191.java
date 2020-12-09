package leetcode.s0101_200;

public class leetcode_191 {

    public int hammingWeight(int n) {
        int count=0;
        String s = Integer.toBinaryString(n);
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        leetcode_191 t = new leetcode_191();
    }
}
