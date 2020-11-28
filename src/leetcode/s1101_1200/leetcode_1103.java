package leetcode.s1101_1200;

public class leetcode_1103 {


    public int[] distributeCandies(int candies, int num_people) {
        int i = 0;
        int[] arr = new int[num_people];
        while (candies > 0) {
            arr[(i+num_people)%num_people] = i+1;
            candies -= (i+1);
            i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        leetcode_1103 t = new leetcode_1103();
    }
}
