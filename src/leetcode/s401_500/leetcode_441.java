package leetcode.s401_500;

public class leetcode_441 {
    public int arrangeCoins(int n) {
        int count = 0;
        int step = 1;
        int remaining = n;
        while (remaining >= step) {
            remaining -= step;
            count = step;
            step += 1;
        }
        return count;
    }
    public static void main(String[] args) {
        leetcode_441 t = new leetcode_441();
        for(int i=0;i<100;i++) {
            System.out.println(i + " " +t.arrangeCoins(i));
        }
    }
}
