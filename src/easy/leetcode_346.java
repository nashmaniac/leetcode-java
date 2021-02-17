package easy;

import java.util.LinkedList;

public class leetcode_346 {
    public void solve() {
        MovingAverage c = new MovingAverage(3);
        System.out.println(c.next(1));
        System.out.println(c.next(10));
        System.out.println(c.next(3));
        System.out.println(c.next(8));
    }


    class MovingAverage {

        /** Initialize your data structure here. */

        LinkedList<Integer> list;
        int size = 0, currSize = 0;
        double total = 0;
        public MovingAverage(int size) {
            this.list = new LinkedList<>();
            this.size = size;
            this.currSize = 0;
            this.total = 0;
        }

        public double next(int val) {
            if(currSize<size) {
                currSize++;
            } else {
                total-= this.list.removeFirst();
            }
            this.list.addLast(val);
            total += val;
            return total/Math.min(currSize, size);
        }
    }

    public static void main(String[] args) {
        leetcode_346 t = new leetcode_346();
        t.solve();
    }
}
