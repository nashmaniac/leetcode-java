package leetcode.s0201_300;

import java.util.Stack;

public class leetcode_225 {

    class MyStack {

        Stack<Integer> first, second;

        /** Initialize your data structure here. */
        public MyStack() {
            first = new Stack<>();
            second = new Stack<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            this.first.push(x);
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
            int t = second.pop();
            while (!second.isEmpty()) {
                first.push(second.pop());
            }
            return t;
        }

        /** Get the top element. */
        public int top() {
            return this.first.peek();
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return this.first.isEmpty();
        }
    }

    public static void main(String[] args) {
        leetcode_225 t = new leetcode_225();
    }
}
