package medium;

public class leetcode_5 {
    public void solve() {
        longestPalindrome("aaaabbaa");
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        int[][] a = new int[n][n];
        int start = 0;
        int maxLen = 1;
        for(int i=0;i<n;i++) {
            a[i][i] = 1;
        }

        for(int i=0;i<n-1;i++) {
            if(s.charAt(i) == s.charAt(i+1)) {
                a[i][i+1] = 1;
                start = i;
                maxLen = 2;
            }
        }

        for(int k=3;k<=n;k++) {
            for(int i=0;i<n-k+1;i++) {
                int j = i+k -1;
                if(a[i+1][j-1] == 1 && s.charAt(i) == s.charAt(j)) {
                    a[i][j] = 1;
                    start = i;
                    if(k > maxLen) {
                        maxLen = k;
                    }
                }
            }
        }
        return s.substring(start, start+maxLen+1);

    }
    public static void main(String[] args) {
        leetcode_5 t = new leetcode_5();
        t.solve();
    }
}
