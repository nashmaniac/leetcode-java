package leetcode.s1301_1400;

public class leetcode_1346 {

    public boolean checkIfExist(int[] arr) {

        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if((arr[j] == arr[i]*2) || (arr[i] == arr[j]*2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        leetcode_1346 t = new leetcode_1346();
    }
}
