package leetcode.s101_200;

import java.util.LinkedList;

public class leetcode_155 {


    class MinStack {

        LinkedList<Integer> data;
        LinkedList<Integer> minData;

        /** initialize your data structure here. */
        public MinStack() {
            this.data = new LinkedList<>();
            this.minData = new LinkedList<>();
        }

        public void push(int x) {
            if(!this.data.isEmpty()) {
                if(x<this.minData.peek()) {
                    this.minData.push(x);
                }
            } else {
                this.minData.push(x);
            }

            this.data.push(x);
        }

        public void pop() {
            int i = this.data.pop();
            if(this.minData.peek() == i) {
                this.minData.pop();
            }
        }

        public int top() {
            return this.data.peek();
        }

        public int getMin() {
            return this.minData.peek();
        }
    }

    public static void main(String[] args) {
        leetcode_155 t = new leetcode_155();
    }
}
