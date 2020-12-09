package leetcode.s001_100;

public class leetcode_28 {


    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) {return 0;}
        int n = needle.length();
        for(int i=0;i<=haystack.length()-n;i++) {
            if(haystack.substring(i, i+n).equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    public void solve() {
        strStr("hello", "ll");
    }

    public static void main(String[] args) {
        leetcode_28 t = new leetcode_28();
        t.solve();
    }
}
