package leetcode.s0201_300;

public class leetcode_258 {

    public int addDigits(int num) {
        int temp = 0;
        while (num>0) {
            temp += (num%10);
            num /= 10;
            if(num == 0) {
                num = temp;
                if (temp < 10) {
                    break;
                }
                temp = 0;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        leetcode_258 t = new leetcode_258();
    }
}
