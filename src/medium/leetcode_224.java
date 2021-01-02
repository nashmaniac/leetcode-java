package medium;

import java.util.Stack;

public class leetcode_224 {
    public void solve() {


//        System.out.println(calculate("(7)-(0)+(4)"));
//        System.out.println(calculate(" 1 + 1"));
//        System.out.println(calculate(" 2-1 + 2 "));
        System.out.println(calculate("2147483647"));
//        System.out.println(calculate("(1+(4+5+2)-3)+(6+8)"));
//        System.out.println(calculate("-2+1"));
    }

    public int evaluateExpressionWithNoReversal(Stack<Object> stack) {
        int res = 0;
        while (!stack.isEmpty() && !String.valueOf(stack.peek()).equals("(")) {
            res += (int) stack.pop();
        }
        return res;
    }

    public int calculateWithNoReversal(String s) {
        Stack<Object> stack = new Stack<>();
        int operand = 0;
        int n = 0;
        int count = 1;
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);

            if(c == '(') {
                stack.push(c);
            } else if (c == ' ') {
                if(n>0) {
                    stack.push(count*operand);
                    operand = 0;
                    count = 1;
                    n = 0;
                }
            } else if (Character.isDigit(c)) {
                operand = (int) (10 * operand) + (int) (c-'0');
                n++;
            } else if (c == ')') {
                if(n>0) {
                    stack.push(count*operand);
                    operand = 0;
                    count = 1;
                    n = 0;
                }
                int res = evaluateExpressionWithNoReversal(stack);
                stack.pop();
                stack.push(res);
            } else {
                if(c == '-') {
                    if(n > 0) {
                        stack.push(count*operand);
                        operand = 0;
                        n = 0;
                    } else {
                        operand = 0;
                        n = 0;
                    }
                    count = -1;
                }
                if (c == '+') {
                    if(n > 0) {
                        stack.push(count*operand);
                        count = 1;
                        operand = 0;
                        n = 0;
                    }
                }
            }
        }
        if(n>0) {
            stack.push(operand);
        }
        return evaluateExpressionWithNoReversal(stack);
    }


    public int evaluateExpressionWithReversal(Stack<Object> stack) {
        int res = 0;
        if(!stack.isEmpty()) {
            try {
                res += (int) stack.pop();
            } catch (Exception e) {
                res -= (int) stack.pop();
            }
        }


        while (!stack.isEmpty() && (char) stack.peek() != ')') {
            char operation = (char) stack.pop();
            if(operation == '+') {
                res += (int) stack.pop();
            } else {
                res -= (int) stack.pop();
            }
        }
        return res;
    }

    public int calculateWithStringReversal(String s) {
        Stack<Object> stack = new Stack<>();
        int operand = 0;
        int n = 0;
        for(int i=s.length()-1;i>=0;i--) {
            char c = s.charAt(i);
            if(c == ')') {
                stack.push(c);
            } else if (Character.isDigit(c)) {
                operand += (int) (Math.pow(10, n)*(int)(c-'0'));
                n++;
            } else if (c == ' ') {
                if(n > 0) {
                    stack.push(operand);
                    operand = 0;
                    n = 0;
                }
            } else if( c != '(') {
                if(n > 0) {
                    stack.push(operand);
                    operand = 0;
                    n = 0;
                }
                stack.push(c);
            } else {
                if(n > 0) {
                    stack.push(operand);
                    operand = 0;
                    n = 0;
                }
                int res = evaluateExpressionWithReversal(stack);
                stack.pop();
                stack.push(res);
            }
        }
        if (n > 0) {
            stack.push(operand);
        }
        return evaluateExpressionWithReversal(stack);
    }

    public int calculate(String s) {
        return calculateWithNoReversal(s);
    }

    public static void main(String[] args) {
        leetcode_224 t = new leetcode_224();
        t.solve();
    }
}
