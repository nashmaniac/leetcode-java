package leetcode;

public class leetcode_1295 {

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i=0;i<nums.length;i++) {
            if(String.valueOf(nums[i]).length()%2==0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        leetcode_1295 t = new leetcode_1295();
        int[] m = new int[] {12,345,2,6,7896};
        System.out.println(t.findNumbers(m));
    }
}
