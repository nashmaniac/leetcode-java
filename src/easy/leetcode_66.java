package easy;

public class leetcode_66 {
    public void solve() {
    }

    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--) {
            if(digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }

        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        leetcode_66 t = new leetcode_66();
        t.solve();
    }
}
