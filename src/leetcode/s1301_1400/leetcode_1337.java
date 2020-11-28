package leetcode.s1301_1400;

import java.util.ArrayList;

public class leetcode_1337 {


    class Row {
        int row;
        int count;
        Row(int row, int count) {
            this.row = row;
            this.count = count;
        }
    }

    class MinHeap {
        ArrayList<Row> data = new ArrayList<>();
        int size = 0;

        MinHeap() {
            this.data = new ArrayList<>();
            size = 0;
        }

        void insert(Row r) {
            this.data.add(r);
        }
        
        void heapify() {

        }

        void heapsort() {

        }
    }





    public int[] kWeakestRows(int[][] mat, int k) {
        return null;
    }

    public static void main(String[] args) {
        leetcode_1337 t = new leetcode_1337();
    }
}
