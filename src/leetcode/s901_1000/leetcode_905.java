package leetcode.s901_1000;

public class leetcode_905 {

    public void merge(int[] a, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i=0;i<n1;i++) {
            left[i] = a[start+i];
        }

        for(int i=0;i<n2;i++) {
            right[i] = a[mid+1+i];
        }

        int leftIndex = 0;
        int rightIndex = 0;
        int currentIndex = start;
        while(leftIndex < n1 && rightIndex < n2) {
            if(left[leftIndex] % 2 == 0) {
                a[currentIndex] = left[leftIndex];
                leftIndex += 1;
            } else {
                a[currentIndex] = right[rightIndex];
                rightIndex += 1;
            }
            currentIndex += 1;
        }


        if (leftIndex<n1) {
            while (leftIndex < n1) {
                a[currentIndex] = left[leftIndex];
                leftIndex += 1;
                currentIndex += 1;
            }
        }

        if (rightIndex<n2) {
            while (rightIndex < n2) {
                a[currentIndex] = right[rightIndex];
                rightIndex += 1;
                currentIndex += 1;
            }
        }
    }

    public void mergeSort(int[] a, int start, int end) {
        if(start < end) {
            int mid = start+(int) ((end-start)/2);
            mergeSort(a, start, mid);
            mergeSort(a, mid+1, end);
            merge(a, start, mid, end);
        }
//        return a;
    }
    public void sortArrayByParity(int[] A) {
        mergeSort(A, 0, A.length-1);
    }

    public int[] sortArrayByParity2(int[] A) {
        return A;
    }

    public static void main(String[] args) {
        leetcode_905 t = new leetcode_905();
        int[] a = new int[] {3, 2, 4, 1};
        t.sortArrayByParity(a);
        for(int b: a ) {
            System.out.print(b+ " ");
        }
    }
}
