package easy;

public class leetcode_482 {
    public void solve() {

    }

    public String licenseKeyFormatting(String S, int K) {
        StringBuilder s = new StringBuilder();
        S = S.replace("-", "").toUpperCase();
        int start = S.length()-1;
        int count = 0;
        while (start >=0) {
            s.append(S.charAt(start));
            count++;
            start--;
            if(count == K && start >=0) {
                s.append("-");
                count = 0;
            }
        }
        return s.reverse().toString();
    }

    public static void main(String[] args) {
        leetcode_482 t = new leetcode_482();
        t.solve();
    }
}
