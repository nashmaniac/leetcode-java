package leetcode.s1401_1500;

public class leetcode_1446 {

    public int maxPower(String s) {
        int count = 0;
        int maxCount = 0;
        char c = s.charAt(0);

        for(int i=0;i<s.length();i++) {
            if(c == s.charAt(i)) {
                count++;
            } else {
                count = 1;
            }

            c = s.charAt(i);
            if(maxCount<count) {
                maxCount = count;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        leetcode_1446 t = new leetcode_1446();
        System.out.println(t.maxPower("leetcode"));
    }
}
