package leetcode.s801_900;

import java.util.HashMap;
import java.util.HashSet;

public class leetcode_804 {
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<Character, String> charMap = new HashMap<Character, String>();
        HashSet<String> b = new HashSet<>();
        String[] morseCodes = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        for (int i=0;i<26;i++) {
            charMap.put((char)(i+97), morseCodes[i]);
        }

        for(int i=0;i< words.length;i++){
            StringBuilder s = new StringBuilder();
            for (int j=0;j<words[i].length();j++) {
                s.append(charMap.get(words[i].charAt(j)));
            }

//            System.out.println(s.toString());
            if (!b.contains(s.toString())) {
                b.add(s.toString());
            }
        }

        return b.size();
    }

    public static void main(String[] args) {
        leetcode_804 t = new leetcode_804();
        System.out.println(t.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }
}
