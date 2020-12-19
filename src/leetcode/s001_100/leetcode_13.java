package leetcode.s001_100;

import java.util.HashMap;

public class leetcode_13 {

    public int romanToInt(String s) {
        char[] letters = new char[] {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] nums = new int[] {1, 5, 10, 50, 100, 500, 1000};
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i=0;i<letters.length;i++) {
            hashMap.put(letters[i], nums[i]);
        }
        // left to right pass
        /**
        int i=0;
        int total = 0;
        while (i<s.length()-1) {
            if(hashMap.get(s.charAt(i)) >= hashMap.get(s.charAt(i+1))) {
                total += hashMap.get(s.charAt(i));
                i++;
            } else {
                total += (hashMap.get(s.charAt(i+1)) - hashMap.get(s.charAt(i)));
                i+=2;
            }
        }

        if(i<s.length()) {
            total += hashMap.get(s.charAt(i));
        }
        return total;
        **/

        // right to left pass
        int i=s.length()-1; char lastcharacter = s.charAt(i);
        int total = hashMap.get(lastcharacter);
        i--;
        while (i>=0) {
            if(hashMap.get(s.charAt(i)) < hashMap.get(lastcharacter)) {
                total -= hashMap.get(s.charAt(i));
            } else {
                total += hashMap.get(s.charAt(i));
            }

            lastcharacter = s.charAt(i);
            i--;
        }
        return total;


    }

    public static void main(String[] args) {
        leetcode_13 t = new leetcode_13();
    }
}
