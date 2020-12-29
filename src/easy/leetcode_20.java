package easy;

import java.util.ArrayList;
import java.util.HashSet;

public class leetcode_20 {
    public void solve() {
    }

    public boolean isValid(String s) {
        ArrayList<Character> a = new ArrayList<>();
        HashSet<Character> h = new HashSet<>();
        h.add('(');
        h.add('{');
        h.add('[');
        for(Character c: s.toCharArray()) {
            if(h.contains(c)) {
               a.add(c);
            } else {
                if (a.isEmpty()) {
                    return false;
                }
                if(c == ')' && a.get(a.size()-1) != '(') {
                    return false;
                }
                if(c == ']' && a.get(a.size()-1) != '[') {
                    return false;
                }
                if(c == '}' && a.get(a.size()-1) != '{') {
                    return false;
                }
                a.remove(a.size()-1);
            }
        }
        return a.isEmpty();
    }

    public static void main(String[] args) {
        leetcode_20 t = new leetcode_20();
        t.solve();
    }
}
