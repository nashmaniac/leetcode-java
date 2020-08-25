package leetcode;

import java.util.Arrays;

public class leetcode_709 {

    public String toLowerCase(String str) {
        char[] chArray = str.toCharArray();
        for (int i=0;i<chArray.length;i++) {
            int int_value = (int)(chArray[i]);
            if( int_value >= 65 && int_value <= 90) {
                chArray[i] = (char)(int_value+32);
            }
        }
        return new String(chArray);
    }
    public static void main(String[] args) {
        leetcode_709 t = new leetcode_709();
    }
}
