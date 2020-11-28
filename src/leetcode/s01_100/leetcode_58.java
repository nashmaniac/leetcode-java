package leetcode.s01_100;


public class leetcode_58 {

    public int lengthOfLastWord(String s) {
        int count = 0;
        boolean characterFound = false;
        for(int i=s.length()-1;i>-1;i--) {
            if(s.charAt(i) == ' ') {
                if(characterFound) {
                    break;
                }
            } else {
                if(!characterFound) {
                    characterFound = true;
                }
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        leetcode_58 t = new leetcode_58();
    }
}
