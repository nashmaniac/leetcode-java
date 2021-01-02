package medium;

public class leetcode_11 {
    public void solve() {
    }

    public int maxAreaBrute(int[] height) {
        int maxarea = 0;
        for(int i=0;i<height.length;i++) {
            for(int j=i+1;j<height.length;j++) {
                maxarea = Math.max(maxarea, Math.min(height[i], height[j])*(j-i));
            }
        }
        return maxarea;
    }


    public int maxAreaTwoPointer(int[] height) {
        int maxarea = 0;
        int left = 0, right = height.length-1;
        while (left < right) {
            maxarea = Math.max(maxarea, Math.min(height[left], height[right])*(right-left));
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxarea;
    }

    public int maxArea(int[] height) {
        return maxAreaBrute(height);
    }


    public static void main(String[] args) {
        leetcode_11 t = new leetcode_11();
        t.solve();
    }
}
