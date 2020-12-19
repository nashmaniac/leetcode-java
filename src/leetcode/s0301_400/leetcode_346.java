package leetcode.s0301_400;

import java.util.ArrayList;

public class leetcode_346 {

    class MovingAverage {

        /** Initialize your data structure here. */
        int size;
        ArrayList<Integer> arr;
        public MovingAverage(int size) {
            size = size;
            arr = new ArrayList<>();
        }

        public double next(int val) {
            double count = 0;
            for(int i=Math.max(0, arr.size()-size);i<size;i++) {
                count += arr.get(i);
            }
            return count/val;
        }
    }

    public static void main(String[] args) {
        leetcode_346 t = new leetcode_346();
    }
}
