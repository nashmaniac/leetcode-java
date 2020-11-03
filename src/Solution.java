import java.util.ArrayList;

public class Solution {

    class Stack {
        ArrayList<Character> data = new ArrayList<>();
        boolean isEmpty() {
            return this.data.size() == 0;
        }
        void push(Character s) {
            this.data.add(s);
        }

        Character pop() {
            Character c = this.data.get(this.data.size()-1);
            this.data.remove(this.data.size()-1);
            return c;
        }

        Character peek() {
            if (isEmpty()) {
                return null;
            }
            return this.data.get(this.data.size()-1);
        }

    }


    public String removeOuterParentheses(String S) {

        Stack b = new Stack();
        StringBuilder chars = new StringBuilder();

        for(int i=0;i<S.length();i++) {
            char c = S.charAt(i);
            if(!b.isEmpty()) {
                if(b.peek() == ')' && c==')') {
                    // pop till one
                    for(int j=1;j<b.data.size();j++) {
                        chars.append(b.data.get(j));
                    }
                    while (!b.isEmpty()) {
                        b.pop();
                    }
                } else {
                    b.push(c);
                }
            } else {
                b.push(c);
            }

        }
        return chars.toString();
    }


    public static void main(String[] args) {
        Solution t = new Solution();
        System.out.print(t.removeOuterParentheses("(()())(())(()(()))"));
    }
}
