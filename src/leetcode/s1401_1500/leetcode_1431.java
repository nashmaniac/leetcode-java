package leetcode.s1401_1500;

import java.util.*;

public class leetcode_1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // find the maximum value with all the kids
        int max_number = 0;

        for (int j : candies) {
            if (j > max_number) {
                max_number = j;
            }
        }
        List<Boolean> b = new ArrayList<>();
        for (int candy : candies) {
            b.add(candy + extraCandies >= max_number);
        }
        return b;
    }

    public static void main(String[] args) {
        leetcode_1431 t = new leetcode_1431();
        List<Boolean> b = t.kidsWithCandies(new int[]{4,2,1,1,2}, 1);
        for(boolean c: b) {
            System.out.print(c);
        }
    }
}
