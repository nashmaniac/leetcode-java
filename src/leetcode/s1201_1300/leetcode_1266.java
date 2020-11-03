package leetcode.s1201_1300;

public class leetcode_1266 {

    public int minTimeToVisitAllPoints(int[][] points) {
        int count =0;
        for(int i=1;i< points.length;i++) {
            count += Math.max(Math.abs(points[i][0]-points[i-1][0]), Math.abs(points[i][1]-points[i-1][1]));
        }
        return count;
    }
    public static void main(String[] args) {
        leetcode_1266 t = new leetcode_1266();
    }
}
