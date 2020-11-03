package leetcode.s1301_1400;

public class leetcode_1309 {

    public String freqAlphabets(String s) {
        StringBuilder strBuilder = new StringBuilder();
        int count = 0;
        while (count < s.length()) {
            if (count + 2 < s.length() && s.charAt(count+2) == '#') {
                String temp = s.substring(count, count+2);
                strBuilder.append((char)(Integer.valueOf(temp).intValue()+96));
                count += 3;
            } else {
                String temp = s.substring(count, count+1);
                strBuilder.append((char)(Integer.valueOf(temp).intValue()+96));
                count += 1;
            }
        }
        return strBuilder.toString();
    }
    public static void main(String[] args) {
        leetcode_1309 t = new leetcode_1309();
        String[] strings = new String[] {
                "1326#", "10#11#12", "25#", "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"
        };
        for(String s: strings) {
            System.out.println(t.freqAlphabets(s));
        }
    }
}
