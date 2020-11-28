package leetcode.s01_100;

public class leetcode_38 {

    public String countAndSay(int n) {
        if(n == 1) {
            return "1";
        }
        String s = countAndSay(n-1);
        StringBuilder so = new StringBuilder();
        Character c = s.charAt(0);
        int count = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == c) {
                count++;
            } else {
                so.append(count);
                so.append(c);
                c = s.charAt(i);
                count = 1;
            }
        }
        so.append(count);
        so.append(c);
        return so.toString();
    }

    public void solve() {
        System.out.println(countAndSay(4));
    }

    public static void main(String[] args) {
        leetcode_38 t = new leetcode_38();
        t.solve();
    }
}
