package leetcode;

public class leetcode_1486 {

    public int xorOperation(int n, int start) {
        int count = 0;
        for (int i=0;i<n;i++) {
            count = count ^ (start+2*i);
        }
        return count;
    }

    public static void main(String[] args) {
        leetcode_1486 t = new leetcode_1486();
        System.out.print(t.xorOperation(5, 0));
    }
}
