package medium;

import java.util.HashSet;
import java.util.Stack;

public class leetcode_1249 {
    public void solve() {
    }

    class Element {
        char c;
        int index;

        Element(int index, char c) {
            this.index = index;
            this.c = c;
        }
    }

    public String minRemoveToMakeValid(String s) {
        HashSet<Integer> hashSet = new HashSet<>();
        Stack<Element> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '(') {
                stack.push(new Element(i, s.charAt(i)));
            } else {
                if(stack.isEmpty()) {
                    hashSet.add(i);
                } else if(stack.peek().c == '(') {
                    stack.pop();
                } else {

                }
            }
        }

        while (!stack.isEmpty()) {
            hashSet.add(stack.pop().index);
        }

        StringBuilder st = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            if(!hashSet.contains(i)) {
                st.append(s.charAt(i));
            }
        }
        return st.toString();
    }

    public static void main(String[] args) {
        leetcode_1249 t = new leetcode_1249();
        t.solve();
    }
}
