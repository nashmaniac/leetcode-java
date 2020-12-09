package leetcode.s001_100;

import java.util.Stack;

public class leetcode_20 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character c: s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            if(c == ')' || c == ']' || c == '}') {
                if(stack.isEmpty()) {return false;}
                if(c == ')' && stack.peek()!= '(') {
                    return false;
                }
                if(c == ']' && stack.peek()!= '[') {
                    return false;
                }
                if(c == '}' && stack.peek()!= '{') {
                    return false;
                }
                stack.pop();
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        leetcode_20 t = new leetcode_20();
    }
}
