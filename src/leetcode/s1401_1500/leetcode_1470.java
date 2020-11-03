package leetcode.s1401_1500;

public class leetcode_1470 {


    public int[] shuffle(int[] nums, int n) {
        int[] a= new int[2*n];
        int k = 0;
        for (int i=0;i<n;i++) {
            a[k] = nums[i];
            k = k+1;
            a[k] = nums[i+n];
            k = k+1;
        }
        return a;
    }

    public static void main(String[] args) {
        leetcode_1470 t = new leetcode_1470();

//        int[] m = t.shuffle(new int[] {2,5,1,3,4,7}, 3);
        int[] m = t.shuffle(new int[] {1,2,3,4,4,3,2,1}, 4);

        for (int c: m) {
            System.out.print(c+" ");
        }

    }
}
