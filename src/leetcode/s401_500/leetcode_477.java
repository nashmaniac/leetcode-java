package leetcode.s401_500;

public class leetcode_477 {

    public int hammingDistance(int x, int y) {

        String xString = Integer.toBinaryString(x);
        String yString = Integer.toBinaryString(y);
        int xLen = xString.length();
        int yLen = yString.length();
        int count = 0;
        if(xLen < yLen) {
            int diff = yLen - xLen;
            for(int i=0;i<diff;i++) {
                if(yString.charAt(i) == '1') {
                    count++;
                }
            }

            for(int i=0;i<xLen;i++) {
                if(xString.charAt(i)!=yString.charAt(diff+i)) {
                    count++;
                }
            }
        } else if(yLen < xLen) {

            int diff = xLen - yLen;
            for(int i=0;i<diff;i++) {
                if(xString.charAt(i) == '1') {
                    count++;
                }
            }

            for(int i=0;i<yLen;i++) {
                if(xString.charAt(diff+i)!=yString.charAt(i)) {
                    count++;
                }
            }

        } else {
            for(int i=0;i<xLen;i++) {
                if(xString.charAt(i)!=yString.charAt(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    public int totalHammingDistance(int[] nums) {

        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                sum += hammingDistance(nums[i], nums[j]);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        leetcode_477 t = new leetcode_477();
    }
}
