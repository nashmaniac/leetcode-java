package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class leetcode_728 {

    private boolean isDivisible(int a) {
        String as = String.valueOf(a);
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for(int i=0;i<as.length();i++) {
            int temp = Integer.valueOf(as.charAt(i)-48);
            if(temp == 0) {
                return false;
            }
            if (!hashSet.contains(temp)) {
                if(a%temp != 0) {
                    return false;
                } else {
                    hashSet.add(temp);
                }
            }
        }
        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> integerList = new ArrayList<>();

        for(int i=left;i<=right;i++) {
            boolean b = this.isDivisible(i);
            if (b) {
                integerList.add(i);
            }
        }
        return integerList;
    }
    public static void main(String[] args) {
        leetcode_728 t = new leetcode_728();

        for(Integer i: t.selfDividingNumbers(1, 22)) {
            System.out.print(i+ " ");
        }
    }
}
