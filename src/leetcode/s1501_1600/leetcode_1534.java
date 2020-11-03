package leetcode.s1501_1600;

public class leetcode_1534 {

    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count =0;
        for(int i=0;i< arr.length-2;i++) {
            for(int j=1;j< arr.length-1;j++) {
                if(Math.abs(arr[i] - arr[j])>a){
                    continue;
                }
                for(int k=2;k< arr.length;k++) {
                    if (
                            (i<j) && (j<k) && (Math.abs(arr[i]-arr[j])<=a) &&(Math.abs(arr[j]-arr[k])<=b) && (Math.abs(arr[i]-arr[k])<=c)
                    ) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        leetcode_1534 t = new leetcode_1534();

        System.out.println(t.countGoodTriplets(
                new int[]{3,0,1,1,9,7}, 7, 2, 3
        ));

    }
}
