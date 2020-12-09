package leetcode.s001_100;

public class leetcode_27 {

    public int removeElement(int[] nums, int val) {
        int length = nums.length;

        for(int i=0;i<length;i++) {
            if(val == nums[i]) {
                if(i != length-1) {
                    for(int j=i+1;j<length;j++) {
                        nums[j-1] = nums[j];
                    }
                    i--;
                }
                length--;
            }

        }
        return length;
    }
    public static void main(String[] args) {
        leetcode_27 t = new leetcode_27();
    }
}
