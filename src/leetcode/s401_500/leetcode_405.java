package leetcode.s401_500;

public class leetcode_405 {


    public String toHex(int num) {

        if (num == 0) {
            return "0";
        }

        boolean negative = false;;
        if (num < 0) {
            negative = true;
            num = Integer.MAX_VALUE + num + 1; //remove the first sign bit
        }

        StringBuilder s = new StringBuilder();
        char[] a = new char[] {'a', 'b', 'c', 'd', 'e', 'f'};
        while (num>0) {
            int x = num%16;
            if(x>9) {
                s.append(a[x-10]);
            } else {
                s.append(x);
            }
            num /= 16;
        }
        return s.reverse().toString();
    }

    public static void main(String[] args) {
        leetcode_405 t = new leetcode_405();
    }
}
