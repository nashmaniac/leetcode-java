package easy;

public class leetcode_66 {
    public void solve() {
    }

    public int[] plusOne(int[] digits) {
        int carry = 0;
        digits[digits.length-1]++;
        for(int i=digits.length-1;i>=0;i--) {
            if(digits[i] > 10) {
                int temp = digits[i];
                digits[i] = (carry+temp)%10;
                carry = (carry+temp)/10;
            }
        }

        if(carry > 0) {
            digits = new int[digits.length+1];
            digits[0] = carry;
        }
        return  digits;
    }

    public static void main(String[] args) {
        leetcode_66 t = new leetcode_66();
        t.solve();
    }
}
