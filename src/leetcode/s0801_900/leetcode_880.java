package leetcode.s0801_900;

public class leetcode_880 {

    public String decodeAtIndex(String S, int K) {
        StringBuilder s = new StringBuilder();
        for(Character c: S.toCharArray()) {
            if(Character.isDigit(c)) {
                String temp = s.toString();
                int m = Integer.parseInt(String.valueOf(c));
                for(int i=0;i<m-1;i++) {
                    s.append(temp);
                }
            } else {
                s.append(c);
            }

            if(s.length() >= K) {
                break;
            }
        }
//        System.out.println(s.toString());
        return String.valueOf(s.toString().charAt(K-1));
    }

    public void solve() {

        System.out.println(decodeAtIndex("leet2code3", 10));
        System.out.println(decodeAtIndex("ha22", 5));
        System.out.println(decodeAtIndex("a2345678999999999999999", 1));
    }

    public static void main(String[] args) {
        leetcode_880 t = new leetcode_880();
        t.solve();
    }
}
