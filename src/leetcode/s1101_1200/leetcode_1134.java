package leetcode.s1101_1200;

public class leetcode_1134 {

    public int findLength(int N) {
        int length = 0;
        while (N > 0) {
            length++;
            N /= 10;
        }
        return length;
    }

    public boolean isArmstrong(int N) {
        int l = findLength(N);
        int temp = N;
        int sum = 0;
        while (temp > 0) {
            sum += Math.pow((temp % 10), l);

            temp /= 10;
        }
        return N == sum;

    }

    public void solve() {
        System.out.println(isArmstrong(153));
    }

    public static void main(String[] args) {
        leetcode_1134 t = new leetcode_1134();
        t.solve();
    }
}
