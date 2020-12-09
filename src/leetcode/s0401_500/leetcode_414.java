package leetcode.s0401_500;

public class leetcode_414 {

    public int thirdMax(int[] nums) {
        Integer max = null;
        Integer secondMax = null;
        Integer thirdMax = null;

        for(int i=0;i<nums.length;i++) {
            int num = nums[i];

            if(max != null && secondMax != null  && thirdMax != null ) {
                if (num == max || num == secondMax || num == thirdMax) {
                    continue;
                }
            }

            if(max==null || num>max) {
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } else if (secondMax == null || (num > secondMax && num < max)) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (thirdMax == null || (num > thirdMax && num < secondMax)) {
                thirdMax = num;
            }
        }
        return thirdMax == null ? max.intValue() : thirdMax.intValue();
    }

    public static void main(String[] args) {
        leetcode_414 t = new leetcode_414();
        System.out.println(t.thirdMax(new int[]{2, 2, 3, 1}));
    }
}
