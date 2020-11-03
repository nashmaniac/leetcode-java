package leetcode.s1301_1400;

public class leetcode_1351 {

    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i=0;i< grid.length;i++) {
            int foundIndex = -1;
            for(int j=0;j<grid[i].length;j++){
                if (grid[i][j] < 0) {
                    foundIndex = j;
                    break;
                }
            }
            if (foundIndex != -1) {
                count += (grid[i].length-foundIndex);
            }

        }
        return count;
    }
    public static void main(String[] args) {
        leetcode_1351 t = new leetcode_1351();
        System.out.println(t.countNegatives(new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}));
    }
}
