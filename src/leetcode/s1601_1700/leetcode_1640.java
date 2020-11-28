package leetcode.s1601_1700;

import java.util.HashMap;

public class leetcode_1640 {

    public boolean canFormArray(int[] arr, int[][] pieces) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            hashMap.put(arr[i], i);
        }

        for(int[] a: pieces) {
            if(!hashMap.containsKey(a[0])) return false;
            for(int i=0;i<a.length;i++) {
                if(!hashMap.containsKey(a[i])) return false;
                if(hashMap.get(a[i])-hashMap.get(a[i-1])!= 1) return false;
            }
        }
        return true;
    }

    public void solve() {
        System.out.println(canFormArray(new int[]{85}, new int[][]{{85}}));
        System.out.print(canFormArray(new int[]{49,18,16}, new int[][]{{16,18,49}}));;
    }

    public static void main(String[] args) {
        leetcode_1640 t = new leetcode_1640();
        t.solve();
    }
}
