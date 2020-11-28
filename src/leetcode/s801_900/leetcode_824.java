package leetcode.s801_900;

import java.util.HashSet;

public class leetcode_824 {

    public String toGoatLatin(String S) {
        String[] s = S.toString().split(" ");
        StringBuilder b = new StringBuilder();
        char[] vowels = {'a', 'e', 'i','o', 'u'};
        HashSet<Character> hashSet = new HashSet<>();
        for(char c: vowels) {
            hashSet.add(c);
        }
        for(int i=0;i<s.length;i++) {
            String revString = s[i];
            if(!hashSet.contains(s[i].toLowerCase().charAt(0))) {
                char f = s[i].charAt(0);
                s[i] = s[i].substring(1);
                s[i] = s[i].concat(String.valueOf(f));
                revString = s[i];
            }
            revString = revString.concat("ma");
            for(int j=0;j<i+1;j++) {
                revString = revString.concat("a");
            }
            if(i != s.length-1) {
                b.append(revString.concat(" "));
            } else {
                b.append(revString);
            }
        }
        return b.toString();
    }

    public void solve() {
//        String S = "I speak Goat Latin";
        String S = "The quick brown fox jumped over the lazy dog";
        System.out.println(toGoatLatin(S));
    }

    public static void main(String[] args) {
        leetcode_824 t = new leetcode_824();
        t.solve();
    }
}
