package leetcode.s001_100;

public class leetcode_14 {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder s = new StringBuilder();
        if(strs.length == 0) return s.toString();
        String firstword = strs[0];
        for(int i=0;i<firstword.length();i++) {
            boolean mismatch = false;
            for(int j=1;j<strs.length;j++) {
                if(i>=strs[j].length()){
                    mismatch = true;
                    break;
                }
                if(firstword.charAt(i) != strs[j].charAt(i)) {
                    mismatch = true;
                    break;
                }
            }
            if(!mismatch) {
                s.append(firstword.charAt(i));
            } else {
                break;
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        leetcode_14 t = new leetcode_14();
    }
}

/*
flower
flow
flight

 */
