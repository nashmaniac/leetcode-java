package leetcode.s0101_200;

import java.util.ArrayList;
import java.util.List;

public class leetcode_125 {

    public boolean isPalindrome(String s) {
        if(s.isEmpty()) {
            return true;
        }
        List<Character> chars = new ArrayList<>();
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++) {
            Character c = s.charAt(i);
            if (!(!(c >= 'A' && c <= 'Z') &&
                    !(c >= 'a' && c <= 'z') &&
                    !(c >= '0' && c <= '9'))) {
                chars.add(c);
            }
        }
        int left = 0;
        int right = chars.size()-1;

        while (left <= right) {
            if(chars.get(left) != chars.get(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public void solve() {
        isPalindrome("A man, a plan, a canal: Panama");
//        isPalindrome("race a car");
    }

    public static void main(String[] args) {
        leetcode_125 t = new leetcode_125();
        t.solve();
    }
}
