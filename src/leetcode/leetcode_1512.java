package leetcode;

public class leetcode_1512 {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i=0;i<nums.length;i++) {
            for (int j=i+1;j<nums.length;j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        leetcode_1512 t = new leetcode_1512();
//        int count = t.numIdenticalPairs(new int[]{1,2,3,1,1,3});
        int count = t.numIdenticalPairs(new int[]{1,1,1,1});
        System.out.print(count);
    }
}
