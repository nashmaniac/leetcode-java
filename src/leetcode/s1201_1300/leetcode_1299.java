package leetcode.s1201_1300;

public class leetcode_1299 {
    public int[] replaceElements(int[] arr) {
        for(int i=0;i< arr.length-1;i++) {
            int max_found = 0;
            for(int j=i+1;j< arr.length;j++) {
                if(arr[j] >= max_found) {
                    max_found = arr[j];
                }
            }
            arr[i] = max_found;
        }
        arr[arr.length-1] = -1;
        return arr;
    }

    public int[] replaceElementsDynamic(int[] arr) {
        if(arr.length > 1) {
            int index = arr.length-2;
            int maxIndex = arr.length-1;
            int maxElem = arr[maxIndex];
            while (index >=0) {
                int temp = arr[index];
                arr[index] = maxElem;
                maxElem = Math.max(temp, maxElem);
                index--;
            }
        }
        arr[arr.length-1] = -1;
        return arr;
    }




    public static void main(String[] args) {
        leetcode_1299 t = new leetcode_1299();
        int[] m = t.replaceElementsDynamic(new int[]{17,18,5,4,6,1});
        for(int b: m) {
            System.out.print(b+" ");
        }
    }
}
