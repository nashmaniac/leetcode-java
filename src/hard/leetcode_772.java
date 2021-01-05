package hard;

import java.util.ArrayDeque;
import java.util.Queue;

public class leetcode_772 {
    public void solve() {

        String[] s = new String[] {
//                "2-(5-6)",
//                "2*(5+5*2) / 3 + (6 / 2 +8) ",
//                "2*(5+(5-3)* 2) / 3 + (6 / 2 + (8*2) ) ",
//                "(   ((  (8+3) *(  4  -  10)  ) -   2  ) +(   (5  +   (   10/  2  )  )+   (  ( 9   + 5   )+(   2  +  2 ) )  )   )"
                " 6-4 / 2 "
        };
        for(String a: s) {
            System.out.println(calculate(a));
        }
    }

    public int helper(Queue<Character> q) {
        int num =0, sum = 0, prevNum = 0;
        int prevOp = '+';
        while (!q.isEmpty()) {
            char c = q.poll();
            if(Character.isDigit(c)) {
                num = 10*num + (int) (c-'0');
            } else if(c == '(') {
                num = helper(q);
            } else {
                switch (prevOp) {
                    case '+':
                        sum += prevNum;
                        prevNum = num;
                        break;
                    case '-':
                        sum += prevNum;
                        prevNum = -num;
                        break;
                    case '*':
                        prevNum *= num;
                        break;
                    case '/':
                        prevNum /= num;
                        break;
                }
                if(c == ')') break;
                prevOp = c;
                num = 0;
            }
        }
        return prevNum + sum;
    }

    public int calculate(String s) {
        Queue<Character> queue = new ArrayDeque<>();
        for(char c: s.toCharArray()) {
            if(c != ' ') {
                queue.offer(c);
            }
        }
        queue.offer(' ');

        return helper(queue);
    }


    public static void main(String[] args) {
        leetcode_772 t = new leetcode_772();
        t.solve();
    }
}
