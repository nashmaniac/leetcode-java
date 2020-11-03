package leetcode.s1001_1100;

public class leetcode_1021 {

    public String removeOuterParentheses(String S) {
        StringBuilder str = new StringBuilder();
        int start = 0;
        int check = 0;
        for (int i=0;i<S.length();i++) {
            if (S.charAt(i) == '(') {
                check++;
            } else {
                check--;
            }
            if (check == 0) {
                str.append(S.substring(start+1, i));
                start = i+1;
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        leetcode_1021 t = new leetcode_1021();
    }
}
