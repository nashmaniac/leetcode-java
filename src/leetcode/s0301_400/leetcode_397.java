package leetcode.s0301_400;

public class leetcode_397 {

    public int integerReplacement(int n) {
        if (n == Integer.MAX_VALUE) return 32;
        if(n==1)return 0;
        if(n==2)return 1;
        if(n==3)return 2;
        if(n%2==0) {
            return 1+integerReplacement(n/2);
        } else {
            return 1+ Math.min(integerReplacement(n-1), integerReplacement(n+1));
        }
    }


    public static void main(String[] args) {
        leetcode_397 t = new leetcode_397();
    }
}
