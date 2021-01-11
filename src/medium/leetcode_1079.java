package medium;

import java.util.ArrayList;
import java.util.HashSet;

public class leetcode_1079 {
    public void solve() {

        for(String s: new String[]{"AAB",}) {
            System.out.println(numTilePossibilities(s));
        }

    }
    HashSet<ArrayList<Character>> h;
    public void bt(ArrayList<Character> a, ArrayList<Character> cur, int len, int index) {
        if(index >= len) {
            System.out.println(cur);

            h.add(new ArrayList<>(cur));
            return;
        }

        cur.add(a.get(index));

        bt(a, cur, len, index+1);
        cur.remove(cur.size()-1);

        bt(a, cur, len, index+1);
    }

    public int numTilePossibilities(String tiles) {

        ArrayList<Character> a = new ArrayList<>();
        for(char c: tiles.toCharArray()) {
            a.add(c);
        }

        h = new HashSet<>();
        bt(a, new ArrayList<>(), tiles.length(), 0);
        return h.size();

    }

    public static void main(String[] args) {
        leetcode_1079 t = new leetcode_1079();
        t.solve();
    }
}
