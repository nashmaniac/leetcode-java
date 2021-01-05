package medium;

import java.util.ArrayList;
import java.util.List;

public class leetcode_386 {
    public void solve() {
        System.out.println(lexicalOrder(13));
    }

    public void generateNumber(List<Integer> arr, int startNumber, int n) {
        if(startNumber > n) {
            return;
        }
        if(startNumber != 0) {
            arr.add(startNumber);
        }

        for(int i=0;i<10;i++) {
            if(startNumber == 0 && i == 0) {
                continue;
            }

            if (startNumber * 10 + i <= n) {
                generateNumber(arr, startNumber*10 + i, n);
            } else {
                break;
            }

        }
    }

    public List<Integer> lexicalOrder(int n) {
        List<Integer> arr = new ArrayList<>();
        generateNumber(arr, 0, n);
        return arr;
    }

    public static void main(String[] args) {
        leetcode_386 t = new leetcode_386();
        t.solve();
    }
}
