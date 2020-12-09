package leetcode.s0101_200;

import java.util.ArrayList;
import java.util.List;

public class leetcode_118 {


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();
        for(int i=0;i<numRows;i++) {
            arr.add(new ArrayList<>());
        }

        for (int i=0;i<numRows;i++) {
            if(i>0) {
                for(int j=0;j<i;j++) {
                    if(j==0) {
                        arr.get(i).add(1);
                    } else {
                        arr.get(i).add(arr.get(i-1).get(j)+arr.get(i-1).get(j-1));
                    }
                }
            }
            arr.get(i).add(1);
        }
        return arr;
    }

    public void solve() {
        for(int i=0;i<6;i++) {
            List<List<Integer>> arr = generate(i);
            for(List<Integer> a: arr) {
                for(Integer b: a) {
                    System.out.print(b+" ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        leetcode_118 t = new leetcode_118();
        t.solve();
    }
}
