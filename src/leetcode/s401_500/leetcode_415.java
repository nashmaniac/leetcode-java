package leetcode.s401_500;

public class leetcode_415 {

    public String addStrings(String num1, String num2) {

        int l = num1.length()-1;
        int r = num2.length()-1;

        if(l<r) {
            return addStrings(num2, num1);
        }

        int carry = 0;
        StringBuilder s = new StringBuilder();
        while (r>=0) {
            int x = Integer.parseInt(String.valueOf(num2.charAt(r))) + Integer.parseInt(String.valueOf(num1.charAt(l))) + carry;
            s.append(x%10);
            carry = x/10;
            l--;
            r--;
        }

        while (l>=0) {
            int x = Integer.parseInt(String.valueOf(num1.charAt(l))) + carry;
            l--;
            s.append(x%10);
            carry = x/10;
        }

        if(carry > 0) {
            s.append(carry);
        }
        return s.reverse().toString();
    }

    public void solve() {
        addStrings("10", "11");
    }

    public static void main(String[] args) {
        leetcode_415 t = new leetcode_415();
        t.solve();

    }
}
