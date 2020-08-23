package leetcode;

public class leetcode_1342 {
    private boolean isEven(int num) {
        return num % 2 != 1;
    }
    private int adjustVariable(int num) {
        if (!isEven(num)) {
            return num-1;
        }
        return num/2;
    }
    public int numberOfSteps (int num) {
        int count = 0;
        while (num != 0) {
            num = adjustVariable(num);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        leetcode_1342 t = new leetcode_1342();

        System.out.println(t.numberOfSteps(14));
    }
}
