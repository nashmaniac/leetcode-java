package leetcode.s1201_1300;

import java.util.ArrayList;
import java.util.List;

public class leetcode_1213 {

    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {

        List<Integer> a = new ArrayList<>();
        int secondIndex = 0;
        int thirdIndex = 0;

        for(int i=0;i<arr1.length;i++) {
            while (secondIndex<arr2.length-1 && arr2[secondIndex] < arr1[i]) {
                secondIndex++;
            }
            while (thirdIndex<arr3.length-1 && arr3[thirdIndex] < arr1[i]) {
                thirdIndex++;
            }
            if(arr1[i] == arr2[secondIndex] && arr2[secondIndex] == arr3[thirdIndex]) {
                a.add(arr1[i]);
            }
        }
        return a;

    }

    public static void main(String[] args) {
        leetcode_1213 t = new leetcode_1213();
    }
}
