package easy;

public class leetcode_415 {
    public void solve() {
    }

    public String addStrings(String num1, String num2) {
        int a = num1.length();
        int b = num2.length();

        if(a>b) {
            return addStrings(num2, num1);
        }
        a--;
        b--;
        StringBuilder s = new StringBuilder();
        int carry = 0;
        while (a>=0) {
            int x = Integer.parseInt(String.valueOf(num1.charAt(a)));
            int y = Integer.parseInt(String.valueOf(num2.charAt(b)));
            a--;
            b--;
            int temp = x+y+carry;
            s.append(temp % 10);
            carry = temp / 10;
        }

        while (b>=0) {
            int y = Integer.parseInt(String.valueOf(num2.charAt(b)));
            b--;
            int temp = y+carry;
            s.append(temp % 10);
            carry = temp / 10;
        }
        if(carry>0) {
            s.append(carry);
        }

        return s.reverse().toString();
    }



    public static void main(String[] args) {
        leetcode_415 t = new leetcode_415();
        t.solve();
    }
}
