package leetcode;

public class leetcode_905 {
    public int[] sortArrayByParity(int[] A) {
        int even_index = 0;
        int odd_index = 0;

        while (even_index <= odd_index) {
            while (A[odd_index]%2 != 1) {
                odd_index += 1;
            }
            while (A[even_index]%2 != 1) {
                even_index += 1;
            }



        }
        return A;
    }
    public static void main(String[] args) {
        leetcode_905 t = new leetcode_905();
    }
}
