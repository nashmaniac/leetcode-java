package hard;

import java.util.*;

public class leetcode_726 {
    public void solve() {
        System.out.println(countOfAtoms("K4(ON(SO3)2)2"));
    }

    public String countOfAtoms(String formula) {
        int n = formula.length();
        int i = 0;
        Stack<HashMap<String, Integer>> stack = new Stack<>();
        stack.push(new HashMap<>());
        while (i<n) {
            char c = (char) formula.charAt(i);
            if(c == '(') {
                stack.push(new HashMap<>());
                i++;
            } else if(c == ')') {
                int iStart = ++i;

                while (i<n && Character.isDigit(formula.charAt(i))) {
                    i++;
                }

                int multiplicity = iStart < i ? Integer.parseInt(formula.substring(iStart, i)) : 1;
                HashMap<String, Integer> h = stack.pop();
                for(Map.Entry<String, Integer> a: h.entrySet()) {
                    stack.peek().put(
                            a.getKey(), a.getValue() * multiplicity
                    );
                }

            } else {
                int iStart = i++;
                while (i<n && Character.isLowerCase(formula.charAt(i))) {
                    i++;
                }
                String formul = formula.substring(iStart, i);
                iStart = i;
                while (i<n && Character.isDigit(formula.charAt(i))) {
                    i++;
                }
                int count = iStart<i ? Integer.parseInt(formula.substring(iStart, i)) : 1;

                stack.peek().put(
                        formul, stack.peek().getOrDefault(formul, 0) + count
                );
            }
        }
        HashMap<String, Integer> h= stack.pop();
        StringBuilder stringBuilder = new StringBuilder();

        List<String> a = new ArrayList<>();
        for(String _a: h.keySet()) {
            a.add(_a);
        }
        Collections.sort(a);
        for(String b: a) {
            stringBuilder.append(b);
            if(h.get(b) > 1) {
                stringBuilder.append(h.get(b));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        leetcode_726 t = new leetcode_726();
        t.solve();
    }
}
