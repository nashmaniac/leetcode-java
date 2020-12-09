package leetcode.s0401_500;

public class leetcode_482 {

    public String licenseKeyFormatting(String S, int K) {
        StringBuilder s = new StringBuilder();

        for(Character c: S.toCharArray()) {
            if(c!='-') {
                s.append(c);
            }
        }
        String so = s.toString();
        s = new StringBuilder();
        int index = 0;
        while (index<so.length()) {
            s.append(so.substring(index, Math.min(index+K, so.length())).toUpperCase());
            if(index+K<so.length()) {
                s.append("-");
            }
            index = index+K;
        }
        return s.toString();
    }

    public static void main(String[] args) {
        leetcode_482 t = new leetcode_482();
    }
}
