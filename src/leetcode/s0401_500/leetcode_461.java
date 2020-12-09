package leetcode.s0401_500;
public class leetcode_461 {

    public int hammingDistance(int x, int y) {

        String xString = Integer.toBinaryString(x);
        String yString = Integer.toBinaryString(y);
        int xLen = xString.length();
        int yLen = yString.length();
        int count = 0;
        if(xLen < yLen) {
            int diff = yLen - xLen;
            for(int i=0;i<diff;i++) {
                if(yString.charAt(i) == '1') {
                    count++;
                }
            }

            for(int i=0;i<xLen;i++) {
                if(xString.charAt(i)!=yString.charAt(diff+i)) {
                    count++;
                }
            }
        } else if(yLen < xLen) {

            int diff = xLen - yLen;
            for(int i=0;i<diff;i++) {
                if(xString.charAt(i) == '1') {
                    count++;
                }
            }

            for(int i=0;i<yLen;i++) {
                if(xString.charAt(diff+i)!=yString.charAt(i)) {
                    count++;
                }
            }

        } else {
            for(int i=0;i<xLen;i++) {
                if(xString.charAt(i)!=yString.charAt(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        leetcode_461 t = new leetcode_461();

//        System.out.println(t.hammingDistance(4, 10));
        System.out.println(t.hammingDistance(3, 1));
    }
}
