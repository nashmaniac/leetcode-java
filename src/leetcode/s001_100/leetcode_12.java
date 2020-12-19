package leetcode.s001_100;

public class leetcode_12 {

    public String intToRoman(int num) {
        String[] letters = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] nums = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder s = new StringBuilder();

        for(int i=0;i<nums.length;i++) {
            while (nums[i]<=num) {
                num-=nums[i];
                s.append(letters[i]);
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        leetcode_12 t = new leetcode_12();
    }
}
