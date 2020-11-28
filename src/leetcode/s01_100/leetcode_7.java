package leetcode.s01_100;

public class leetcode_7 {

    public int reverse(int x) {
        StringBuilder s = new StringBuilder();
        boolean negative = false;
        if(x<0) {
            negative = true;
        }
        while (x>0) {
            s.append(x%10);
            x/=10;
        }
        if(negative) {
            return 0-Integer.parseInt(s.toString());
        }

        try {
            return s.length() == 0 ? 0: Integer.parseInt(s.toString());
        } catch (NumberFormatException e) {
            return 0;
        }

    }

    public static void main(String[] args) {
        leetcode_7 t = new leetcode_7();
    }
}
