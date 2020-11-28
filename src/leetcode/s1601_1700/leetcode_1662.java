package leetcode.s1601_1700;

public class leetcode_1662 {


    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(String s: word1) {
            s1.append(s);
        }
        for(String s: word2) {
            s2.append(s);
        }
        return s1.toString().equals(s2.toString());
    }

    public static void main(String[] args) {
        leetcode_1662 t = new leetcode_1662();
    }
}
