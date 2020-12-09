package leetcode.s0701_800;

import java.util.ArrayList;

public class leetcode_706 {

    class MyHashMap {

        /** Initialize your data structure here. */
        ArrayList<Integer> data;
        public MyHashMap() {
            data = new ArrayList<>(1000000+1);
            for(int i=0;i<1000000;i++) {
                data.add(null);
            }
        }

        /** value will always be non-negative. */
        public void put(int key, int value) {
            data.add(key, value);
        }

        /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
        public int get(int key) {
            if(data.get(key) == null) {
                return -1;
            }
            return data.get(key);
        }

        /** Removes the mapping of the specified value key if this map contains a mapping for the key */
        public void remove(int key) {
            data.set(key, null);
        }
    }

    public void solve() {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        hashMap.get(1);            // returns 1
        hashMap.get(3);            // returns -1 (not found)
        hashMap.put(2, 1);          // update the existing value
        hashMap.get(2);            // returns 1
        hashMap.remove(2);          // remove the mapping for 2
        hashMap.get(2);
    }


    public static void main(String[] args) {
        leetcode_706 t = new leetcode_706();
        t.solve();
    }
}
