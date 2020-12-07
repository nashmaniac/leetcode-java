package leetcode.s1101_1200;

public class leetcode_1122 {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int pivot = 0;
        for(int i=0;i<arr2.length;i++) {
            for(int j=pivot;j<arr1.length;j++) {
                if(arr1[j]==arr2[i]) {
                    int t = arr1[pivot];
                    arr1[pivot] = arr1[j];
                    arr1[j] = t;
                    pivot++;
                }
            }
        }

        for(int i=pivot;i<arr1.length;i++) {
            for(int j=i+1;j<arr1.length;j++) {
                if(arr1[i]>arr1[j]) {
                    int m = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = m;
                }
            }
        }
        return arr1;
    }

    public void solve() {
        relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19}, new int[]{2,1,4,3,9,6});
    }

    public static void main(String[] args) {
        leetcode_1122 t = new leetcode_1122();
        t.solve();
    }
}
