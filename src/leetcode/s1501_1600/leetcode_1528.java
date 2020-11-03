package leetcode.s1501_1600;

public class leetcode_1528 {

    public String restoreString(String s, int[] indices) {
        char[] c = new char[indices.length];
        for (int i=0;i< indices.length;i++){
            c[indices[i]] = s.charAt(i);
        }
        return new String(c);
    }
    public static void main(String[] args) {
        leetcode_1528 t = new leetcode_1528();
        String s = t.restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3});
        for(int i=0;i<s.length();i++) {
            System.out.print(s.charAt(i));
        }
    }
}
