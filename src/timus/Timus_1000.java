package timus;

import java.io.PrintWriter;
import java.util.Scanner;

class HelperClass {
    public int addTwoNumber(int a , int b) {
        return a+b;
    }
}

public class Timus_1000 {

    public static void main(String[] args) {

        HelperClass t = new HelperClass();
        Scanner s = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = s.nextInt();
        int b = s.nextInt();

        int out_num = t.addTwoNumber(a, b);

        out.println(out_num);
        out.flush();
    }
}
