package leetcode;

public class leetcode_1323 {
    public int maximum69Number (int num) {
        char[] s = String.valueOf(num).toCharArray();

        for (int i=0;i<s.length;i++) {
            if(s[i] == '6') {
                s[i] = '9';
                break;
            }
        }
        return Integer.valueOf(new StringBuilder(String.valueOf(s)).toString());
    }
    public static void main(String[] args) {
        leetcode_1323 t = new leetcode_1323();
        System.out.println(t.maximum69Number(9669));
    }
}
