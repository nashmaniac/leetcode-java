package leetcode;

public class leetcode_657 {

    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (int i=0;i<moves.length();i++) {
            if(moves.charAt(i) == 'U') {
                y += 1;
            }

            if(moves.charAt(i) == 'D') {
                y -= 1;
            }

            if(moves.charAt(i) == 'L') {
                x -= 1;
            }

            if(moves.charAt(i) == 'R') {
                x += 1;
            }
        }
        return x == 0 && y == 0;
    }
    public static void main(String[] args) {
        leetcode_657 t = new leetcode_657();

        String[] stringList = new String[] {
          "UD", "LL", "RRDD", "LDRRLRUULR"
        };

        for(String s: stringList) {
            System.out.println(t.judgeCircle(s));
        }
    }
}
