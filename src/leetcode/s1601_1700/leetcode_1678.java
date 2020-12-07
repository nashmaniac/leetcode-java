package leetcode.s1601_1700;

public class leetcode_1678 {

    public String interpret(String command) {
        int index = 0;
        StringBuilder sb = new StringBuilder();
        while (index<command.length()) {
            if(command.charAt(index) == 'G') {
                sb.append('G');
            }
            if(command.charAt(index) == '(') {
                int start = index;
                while(command.charAt(index) != ')') {
                    index++;
                }
                String s = command.substring(start, index+1);
                if(s.equals("()")) {
                    sb.append('o');
                }
                if(s.equals("(al)")) {
                    sb.append("al");
                }
            }
            index++;
        }
        return sb.toString();
    }

    public void solve() {
        System.out.println(interpret("G()(al)"));
        System.out.println(interpret("G()()()()(al)"));
        System.out.println(interpret("(al)G(al)()()G"));
    }

    public static void main(String[] args) {
        leetcode_1678 t = new leetcode_1678();
        t.solve();
    }
}
