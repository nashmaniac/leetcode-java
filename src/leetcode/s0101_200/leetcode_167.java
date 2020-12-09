package leetcode.s0101_200;

import java.util.HashMap;

public class leetcode_167 {

    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=0;i<numbers.length;i++) {
            if(h.containsKey(numbers[i])) {
                return new int[]{h.get(numbers[i]), i+1};
            } else {
                h.put(target-numbers[i], i+1);
            }
        }
        return null;
    }

    public void solve() {
//        System.out.println(twoSum(new int[]{2, 7, 11, 14}, 9));
        System.out.println(twoSum(new int[]{-1, 0}, -1));
    }

    public static void main(String[] args) {
        leetcode_167 t = new leetcode_167();
        t.solve();
    }
}
