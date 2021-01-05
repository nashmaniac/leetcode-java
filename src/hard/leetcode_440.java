package hard;

import java.util.ArrayList;
import java.util.List;

public class leetcode_440 {
    public void solve() {
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
            if(startNumber*10 + i <= n) {
                generateNumber(arr, startNumber*10+1, n);
            } else {
                break;
            }
        }
    }

    public int findKthNumber(int n, int k) {
        if(k<=n) {
            return k;
        }
        List<Integer> arr = new ArrayList<>();
        generateNumber(arr, 0, n);
        return arr.get(k-1);
    }


    public static void main(String[] args) {
        leetcode_440 t = new leetcode_440();
        t.solve();
    }
}
