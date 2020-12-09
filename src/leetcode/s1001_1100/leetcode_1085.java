package leetcode.s1001_1100;

import java.util.Arrays;

public class leetcode_1085 {

    public int sumOfDigits(int[] A) {
        Arrays.sort(A);
        int num = A[0];
        int sum = 0;
        while(num > 0){
            sum += (num%10);
            num /= 10;
            if(sum > 9 && num == 0) {
                num = sum;
                sum = 0;
            }
        }
        if(sum%2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public void solve() {
        sumOfDigits(new int[]{31,23,60,29,71,65,38,49,99,25,50,93,71,87,97,54,19,75,37,27,33,78,59,19,86,76,93,32,25,23,32,54,38});
    }

    public static void main(String[] args) {
        leetcode_1085 t = new leetcode_1085();
        t.solve();
    }
}
