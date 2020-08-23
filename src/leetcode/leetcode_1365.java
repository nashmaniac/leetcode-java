package leetcode;

public class leetcode_1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] t = new int[nums.length];
        for (int i=0; i<nums.length;i++) {
            int count = 0;
            for (int j=0;j< nums.length;j++) {
                if (i != j && nums[j]<nums[i]) {
                    count++;
                }
            }
            t[i] = count;
            System.out.print(t[i]);
        }
        return t;
    }
    public static void main(String[] args) {
        leetcode_1365 t = new leetcode_1365();
        System.out.println(t.smallerNumbersThanCurrent(new int[]{8,1,2,2,3}).toString());
    }
}
