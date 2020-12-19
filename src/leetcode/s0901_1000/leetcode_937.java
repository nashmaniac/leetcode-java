package leetcode.s0901_1000;

import java.util.Arrays;
import java.util.Comparator;

public class leetcode_937 {


    public String[] reorderLogFiles(String[] logs) {
        Comparator<String> s = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] s1 = o1.split(" ", 2);
                String[] s2 = o2.split(" ", 2);


                boolean digit1 = Character.isDigit(s1[1].charAt(0));
                boolean digit2 = Character.isDigit(s2[1].charAt(0));


                if(!digit1 && !digit2) {
                    int cmp = s1[1].compareTo(s2[1]);
                    if(cmp != 0) {
                        return cmp;
                    } else {
                        return s1[0].compareTo(s2[0]);
                    }
                }

                if(digit1 && !digit2) {
                    return 1;
                } else if (!digit1 && digit2) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };

        Arrays.sort(logs, s);
        return logs;

    }

    public static void main(String[] args) {
        leetcode_937 t = new leetcode_937();
    }
}
