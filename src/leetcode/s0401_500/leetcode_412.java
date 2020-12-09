package leetcode.s0401_500;

import java.util.ArrayList;
import java.util.List;

public class leetcode_412 {


    public List<String> fizzBuzz(int n) {
        List<String> lists = new ArrayList<>();
        for(int i=1;i<n+1;i++) {
            if(i%15==0) {
                lists.add("FizzBuzz");
            } else if(i%3 == 0) {
                lists.add("Fizz");
            } else if(i%5 == 0) {
                lists.add("Buzz");
            } else {
                lists.add(String.valueOf(i));
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        leetcode_412 t = new leetcode_412();
    }
}
