package hard;

public class leetcode_42 {
    public void solve() {
    }

    public int trap(int[] height) {
        int[] left  = new int[height.length];
        int[] right  = new int[height.length];
        for(int i=0;i<height.length;i++) {
            if(i==0) {
                left[i] = height[i];
            } else {
                left[i] = Math.max(left[i-1], height[i]);
            }
        }

        for(int i=height.length-1;i>=0;i--) {
            if(i==height.length-1) {
                right[i] = height[i];
            } else {
                right[i] = Math.max(right[i+1], height[i]);
            }
        }

        int count = 0;
        for(int i=0;i<left.length;i++) {
            count += (Math.min(left[i], right[i])-height[i]);
        }

        return count;

    }

    public static void main(String[] args) {
        leetcode_42 t = new leetcode_42();
        t.solve();
    }
}
