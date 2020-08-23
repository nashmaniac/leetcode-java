package leetcode;

public class leetcode_1281 {
    public int subtractProductAndSum(int n) {
        int sum_count = 0;
        int multiply_count = 1;
        while (n!=0) {
            int digit = n%10;
            sum_count += digit;
            multiply_count *= digit;
            n = n/10;
        }
        return multiply_count - sum_count;
    }
    public static void main(String[] args) {
        leetcode_1281 t = new leetcode_1281();
        System.out.print(t.subtractProductAndSum(234));
    }
}
