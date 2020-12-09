package leetcode.s0201_300;

import java.util.HashMap;
public class leetcode_246 {

    public boolean isStrobogrammatic(String num) {
        HashMap<Character, Character> h = new HashMap<>();
        h.put('1', '1');
        h.put('8', '8');
        h.put('6', '9');
        h.put('9', '6');
        h.put('0', '0');

        StringBuilder s = new StringBuilder();
        for(Character c: num.toCharArray()) {
            if(h.containsKey(c)) {
                s.append(h.get(c));
            } else {
                return false;
            }
        }
        return s.reverse().toString().equals(num);
    }

    public void solve() {
        isStrobogrammatic("69");
    }

    public static void main(String[] args) {
        leetcode_246 t = new leetcode_246();
        t.solve();
    }
}
