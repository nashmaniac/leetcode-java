package leetcode.s0101_200;

import java.util.HashMap;

public class leetcode_170 {

    class TwoSum {

        HashMap<Integer, Integer> a;

        /** Initialize your data structure here. */
        public TwoSum() {
            a = new HashMap<>();
        }

        /** Add the number to an internal data structure.. */
        public void add(int number) {
            a.put(number, a.getOrDefault(number, 0)+1);
        }

        /** Find if there exists any pair of numbers which sum is equal to the value. */
        public boolean find(int value) {
            for(Integer b: a.keySet()) {
                if(a.containsKey(value-b)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        leetcode_170 t = new leetcode_170();
    }
}
