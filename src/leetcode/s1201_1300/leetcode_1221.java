package leetcode.s1201_1300;

public class leetcode_1221 {

    public int balancedStringSplit(String s) {
        int count = 0;
        int right = 0, left = 0;
        
        for (int i=0;i<s.length();i++) {
            if(s.charAt(i) == 'R') {
                right++;
            } else {
                left++;
            }
            if (right>0 && right == left) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        leetcode_1221 t = new leetcode_1221();
        String[] m = new String[]{"RLRRLLRLRL", "RLLLLRRRLR", "LLLLRRRR", "RLRRRLLRLL"};
        for(String s: m) {
            System.out.println(s + " "+ t.balancedStringSplit(s));
        }

    }
}
