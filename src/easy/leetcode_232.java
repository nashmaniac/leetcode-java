package easy;

import java.util.Stack;

public class leetcode_232 {

    class MyQueue {

        /** Initialize your data structure here. */
        Stack<Integer> first;
        Stack<Integer> second;
        public MyQueue() {
            first = new Stack<>();
            second = new Stack<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            first.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            while (!first.empty()) {
                second.push(first.pop());
            }
            int i = second.pop();
            while (!second.empty()) {
                first.push(second.pop());
            }
            return i;
        }

        /** Get the front element. */
        public int peek() {
            while (!first.empty()) {
                second.push(first.pop());
            }
            int i = second.peek();
            while (!second.empty()) {
                first.push(second.pop());
            }
            return i;
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return first.isEmpty();
        }
    }
    public void solve() {
    }

    public static void main(String[] args) {
        leetcode_232 t = new leetcode_232();
        t.solve();
    }
}
