package medium;

import java.util.Stack;

public class leetcode_678 {
    public void solve() {
    }


    public boolean checkValidString(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()) {
            if(c == '(') {
                stack.push(c);
            } else if(c == ')') {
                if(stack.isEmpty()) {
                    return false;
                }
                if(stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            } else {

            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        leetcode_678 t = new leetcode_678();
        t.solve();
    }
}
