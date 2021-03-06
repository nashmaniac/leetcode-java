package leetcode.s0701_800;

public class leetcode_746 {
    public int minCostClimbingStairs(int[] cost) {
        int f1=0, f2=0;
        for (int i=cost.length-1;i>=0;i--) {
            int f0 = cost[i] + Math.min(f1, f2);
            f2 = f1;
            f1=f0;
        }
        return Math.min(f1,f2);
    }

    public static void main(String[] args) {
        leetcode_746 t = new leetcode_746();
        System.out.println(t.minCostClimbingStairs(new int[]{0, 0, 1, 1}));
    }
}
