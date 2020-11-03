package leetcode.s401_500;
public class leetcode_461 {

    public int hammingDistance(int x, int y) {

        char[] xString = String.format("%4s", Integer.toBinaryString(x)).replace(' ', '0').toCharArray();
        char[] yString = String.format("%4s", Integer.toBinaryString(y)).replace(' ', '0').toCharArray();
        for(int i: xString) {
            System.out.print(i+"\t");
        }
        System.out.println();
        for(int i: yString) {
            System.out.print(i+"\t");
        }
        System.out.println();

        int[][] distArray = new int[xString.length+1][yString.length+1];



        for(int i=0;i<=xString.length;i++) {
            for(int j=0;j<=yString.length;j++) {
                if(i==0) {
                    distArray[i][j] = j;
                } else if (j == 0) {
                    distArray[i][j] = i;
                } else {
//                    if (i == 32 || j== 32) {
//                        System.out.print("hello");
//                    }
                    int a = distArray[i][j-1] + 1;
                    int b = distArray[i-1][j] + 1;
                    int c = distArray[i-1][j-1];
                    int d = distArray[i-1][j-1] + 1;

                    if(xString[i-1] == yString[j-1]) {
                        distArray[i][j] = Math.min(Math.min(a, b), c);
                    } else {
                        distArray[i][j] = Math.min(Math.min(a, b), d);
                    }
                }
            }
        }
        for(int[] a: distArray) {
            for(int b: a) {
                System.out.print(b + "\t");
            }
            System.out.println();
        }
        return distArray[xString.length][yString.length];
    }
    public static void main(String[] args) {
        leetcode_461 t = new leetcode_461();

        System.out.println(t.hammingDistance(4, 10));
    }
}
