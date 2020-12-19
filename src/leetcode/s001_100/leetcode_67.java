package leetcode.s001_100;

public class leetcode_67 {


    public String addBinary(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        int carry = 0;
        StringBuilder s = new StringBuilder();
        for(int i=0;i<Math.min(aLen, bLen);i++) {
            int aDigit = Integer.parseInt(String.valueOf(a.charAt(aLen-1-i)));
            int bDigit = Integer.parseInt(String.valueOf(b.charAt(bLen-1-i)));
            int result = (aDigit+bDigit+carry);
            if(result%2==0) {
                s.append("0");
                if(result == 2) {
                    carry = 1;
                } else {
                    carry = 0;
                }
            } else {
                s.append("1");
                if(result == 1) {
                    carry = 0;
                } else {
                    carry = 1;
                }
            }
        }
        if(aLen>bLen) {
            for(int i=0;i<aLen-bLen;i++) {
                int result = Integer.parseInt(String.valueOf(a.charAt(bLen-i)));
                result = result + carry;
                if(result%2==0) {
                    s.append("0");
                    if(result == 2) {
                        carry = 1;
                    } else {
                        carry = 0;
                    }
                } else {
                    s.append("1");
                    if(result == 1) {
                        carry = 0;
                    } else {
                        carry = 1;
                    }
                }
            }
        } else if(bLen>aLen) {
            for(int i=0;i<bLen-aLen;i++) {
                int result = Integer.parseInt(String.valueOf(b.charAt(aLen-i)));
                result = result + carry;
                if(result%2==0) {
                    s.append("0");
                    if(result == 2) {
                        carry = 1;
                    } else {
                        carry = 0;
                    }
                } else {
                    s.append("1");
                    if(result == 1) {
                        carry = 0;
                    } else {
                        carry = 1;
                    }
                }
            }
        }

        if(carry > 0) {
            s.append(carry);
        }

        return s.reverse().toString();
    }


    public void solve() {
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("1010", "1011"));
        System.out.println(addBinary("111", "1"));
    }

    public static void main(String[] args) {
        leetcode_67 t = new leetcode_67();
        t.solve();
    }
}
