package easy;

import java.util.Stack;

public class leetcode_844 {
    public void solve() {
    }

    public String processString(String s) {
        Stack<Character> b = new Stack<>();

        for(Character c: s.toCharArray()) {
            if(c == '#' && !b.isEmpty()) {
                b.pop();
            }

            if(c != '#') {
                b.push(c);
            }
        }

        StringBuilder so = new StringBuilder();
        while (!b.isEmpty()) {
            so.append(b.pop());
        }
        return so.reverse().toString();
    }

    public boolean backspaceCompare(String S, String T) {
        return processString(S).equals(processString(T));
    }

    public static void main(String[] args) {
        leetcode_844 t = new leetcode_844();
        t.solve();
    }
}
