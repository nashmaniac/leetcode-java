package leetcode.s401_500;

public class leetcode_485 {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0) {
                if(max < count) {
                    max=count;
                }
                count=0;
            } else {
                count++;
            }
        }
        if(max<count) {
            max = count;
        }
        return max;
    }

    public static void main(String[] args) {
        leetcode_485 t = new leetcode_485();
        System.out.println(t.findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
    }
}
