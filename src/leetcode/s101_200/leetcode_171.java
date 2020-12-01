package leetcode.s101_200;

public class leetcode_171 {

    public int titleToNumber(String s) {
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        int count = 0;
        for(int i=0;i<ch.length;i++) {
            count+= Math.pow(26, ch.length-1-i);
        }
        return count;
    }

    public static void main(String[] args) {
        leetcode_171 t = new leetcode_171();
    }
}
