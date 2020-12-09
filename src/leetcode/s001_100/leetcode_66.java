package leetcode.s001_100;

import java.util.ArrayList;

public class leetcode_66 {

    public int[] plusOne(int[] digits) {
        digits[digits.length-1]++;
        int carry = digits[digits.length-1]/10;
        digits[digits.length-1] = digits[digits.length-1]%10;
        ArrayList<Integer> numsList = new ArrayList<>();
        numsList.add(0, digits[digits.length-1]);
        for(int i=digits.length-2;i>=0;i--) {
            numsList.add(0, (carry+digits[i])%10);
            carry = (carry+digits[i])/10;
        }
        if(carry>0) {
            numsList.add(0, carry);
        }
        int[] n = new int[numsList.size()];
        for(int i=0;i<n.length;i++){
            n[i] = numsList.get(i);
        }
        return n;
    }


    public void solve() {
//        plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});
        plusOne(new int[]{8,9,9,9});
    }
    public static void main(String[] args) {
        leetcode_66 t = new leetcode_66();
        t.solve();
    }
}
