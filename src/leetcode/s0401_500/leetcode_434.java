package leetcode.s0401_500;

public class leetcode_434 {


    public int countSegments(String s) {
        if(s.isEmpty()) {
            return 0;
        }
        int count = 0;
        int startIndex = 0;
        int endIndex = s.length()-1;
        boolean charFound = false;
        while (s.charAt(endIndex) == ' ') {
            endIndex--;
        }

        while (s.charAt(startIndex) == ' ') {
            startIndex++;
        }



        for(int i=startIndex;i<=endIndex;i++) {
            if(s.charAt(i) == ' ') {
                count++;
            } else {
                charFound = true;
            }
        }
        return charFound == true ? count+1 : 0;
    }

    public static void main(String[] args) {
        leetcode_434 t = new leetcode_434();
    }
}
