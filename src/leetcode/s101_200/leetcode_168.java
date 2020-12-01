package leetcode.s101_200;

public class leetcode_168 {

    public String convertToTitle(int n) {
        StringBuilder s = new StringBuilder();

        while (n>0) {
            int c = (n-1)%26;
            s.append((char) (65+c));
            n = (n-1)/26;
        }
        return s.reverse().toString();
    }

    public void solve(){
        int[] a = new int[]{ 28, 701, 26, 52, 703};
        for(int i=0;i<a.length;i++) {
            System.out.println(convertToTitle(a[i]));
        };
    }

    public static void main(String[] args) {
        leetcode_168 t = new leetcode_168();
        t.solve();
    }
}
