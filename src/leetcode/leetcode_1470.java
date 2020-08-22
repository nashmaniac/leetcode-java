package leetcode;

public class leetcode_1470 {


    public int[] shuffle(int[] nums, int n) {
        int start = 1;
        int end = n;

        while (end < nums.length) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            end+=1;
            start+=1;
        }
        return nums;
    }

    public static void main(String[] args) {
        leetcode_1470 t = new leetcode_1470();

        int[] m = t.shuffle(new int[] {2,5,1,3,4,7}, 3);

        for (int c: m) {
            System.out.print(c+" ");
        }

    }
}
