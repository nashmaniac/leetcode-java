package leetcode.s0501_600;

public class leetcode_541 {

    public String reverseStr(String s, int k) {
        char[] c = s.toCharArray();
        for(int start=0;start<s.length();start+=(2*k)) {
            int i = start, j = Math.min(start+k-1, c.length-1);

            while (i<j) {
                char cb = c[i];
                c[i] = c[j];
                c[j] = cb;
                i++;
                j--;
            }
        }
        return new String(c);

    }

    public void solve() {
        System.out.println(reverseStr("abcdefg", 2));
    }


    public static void main(String[] args) {
        leetcode_541 t = new leetcode_541();
        t.solve();
    }
}
