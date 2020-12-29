package easy;

import java.util.HashMap;

public class leetcode_167 {
    public void solve() {

        twoSum(new int[]{2, 3, 4}, 6);
    }

    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=0;i<numbers.length;i++) {
            if(h.containsKey(target-numbers[i])) {
                return new int[] {h.get(target-numbers[i])+1, i+1};
            } else {
                h.put(numbers[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        leetcode_167 t = new leetcode_167();
        t.solve();
    }
}
