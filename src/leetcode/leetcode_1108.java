package leetcode;

public class leetcode_1108 {

    public String defangIPaddr(String address) {
        StringBuilder s = new StringBuilder();
        for(int i=0;i<address.length();i++) {
            if (address.charAt(i) == '.') {
                s.append("[");
                s.append(address.charAt(i));
                s.append("]");
            } else {
                s.append(address.charAt(i));
            }
        }
        return s.toString();
    }
    public static void main(String[] args) {
        leetcode_1108 t = new leetcode_1108();
        System.out.println(t.defangIPaddr("1.2.3.4"));
    }
}
