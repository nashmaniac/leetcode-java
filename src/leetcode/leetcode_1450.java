package leetcode;

public class leetcode_1450 {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i=0;i< startTime.length;i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        leetcode_1450 t = new leetcode_1450();

        System.out.println(t.busyStudent(new int[]{1,2,3}, new int[]{3,2,7}, 4));
    }
}
