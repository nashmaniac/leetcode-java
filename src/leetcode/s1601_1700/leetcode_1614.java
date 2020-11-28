package leetcode.s1601_1700;

public class leetcode_1614 {

    public int maxDepth(String s) {
        int max = 0;
        int count = 0;
        for(Character c: s.toCharArray()) {
            if(c == '(') {
                count++;
                if(max<count) {
                    max = count;
                }
            } else if(c== ')') {
                count--;
            } else {

            }
        }
        return max;
    }

    public static void main(String[] args) {
        leetcode_1614 t = new leetcode_1614();
    }
}
