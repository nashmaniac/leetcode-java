package medium;

import java.util.Stack;

public class leetcode_227 {
    public void solve() {
        String[] s = new String[] {
            "3+2*2", " 3/2 ", " 3+5 / 2"
        };
        for(String a: s) {
            System.out.println(calculate(a));
        }
    }

    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int operand = 0;
        char operation = '+';
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                operand = (int) (10 * operand) + (int) (c - '0');
                n++;
            }
            if (!Character.isDigit(c) && !Character.isWhitespace(c) || i == s.length() - 1) {
                if(operation == '*') {
                    stack.push(stack.pop() * operand);

                } else if (operation == '/') {
                    stack.push(stack.pop() / operand);
                } else if (operation == '+') {
                    stack.push(operand);
                } else if (operation == '-') {
                    stack.push(-operand);
                } else {

                }

                operand = 0;
                n = 0;
                operation = c;
            }
        }
        int res = 0;
        while (!stack.isEmpty()) {
            res += (int) (stack.pop());
        }
        return res;
    }

    public static void main(String[] args) {
        leetcode_227 t = new leetcode_227();
        t.solve();
    }
}
