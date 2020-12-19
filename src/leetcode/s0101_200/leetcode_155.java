package leetcode.s0101_200;

import java.util.ArrayList;

public class leetcode_155 {

    class MinStack {

        class Element {
            int val;
            int minValue;

            Element(int v, int m) {
                this.val = v;
                this.minValue = m;
            }

        }

        ArrayList<Element> data;
        int size;

        /** initialize your data structure here. */
        public MinStack() {
            data = new ArrayList<>();
            size = 0;
        }

        public boolean isEmpty() {
            return this.size == 0;
        }

        public void push(int x) {
            if(this.isEmpty()) {
                this.data.add(new Element(x, x));
            } else {
                this.data.add(new Element(x, Math.min(this.getMin(), x)));
            }
            this.size++;
        }

        public void pop() {
            this.data.remove(size-1);
            this.size--;
        }

        public int top() {
            return this.data.get(size-1).val;
        }

        public int getMin() {
            return this.data.get(size-1).minValue;
        }
    }

    public static void main(String[] args) {
        leetcode_155 t = new leetcode_155();
    }
}
