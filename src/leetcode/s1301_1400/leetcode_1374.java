package leetcode.s1301_1400;

public class leetcode_1374 {
    public String generateTheString(int n) {
        if (n == 0) {
            return "";
        }
        StringBuilder s = new StringBuilder();

        if (n%2 == 0) {
            for(int i=0;i<n-1;i++) {
                s.append('a');
            }
            s.append('b');
        } else {
            for(int i=0;i<n;i++) {
                s.append('a');
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        leetcode_1374 t = new leetcode_1374();
        for (int i=0;i<100;i++) {
            System.out.println(t.generateTheString(i));
        }

    }
}
