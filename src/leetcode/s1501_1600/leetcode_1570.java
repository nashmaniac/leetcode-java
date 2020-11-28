package leetcode.s1501_1600;

public class leetcode_1570 {


    class SparseVector {

        int[] data;

        SparseVector(int[] nums) {
            data = new int[nums.length];
            for(int i=0;i<nums.length;i++) {
                data[i] = nums[i];
            }
        }

        // Return the dotProduct of two sparse vectors
        public int dotProduct(SparseVector vec) {
            int sum = 0;
            for(int i=0;i< data.length;i++) {
                sum += (data[i]*vec.data[i]);
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        leetcode_1570 t = new leetcode_1570();
    }
}
