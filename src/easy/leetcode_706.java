package easy;

import java.util.ArrayList;
import java.util.LinkedList;

public class leetcode_706 {


    class Pair<U, V> {
        U key;
        V value;
        Pair(U key, V value) {
            this.key = key;
            this.value = value;
        }
    }


    class Bucket {
        ArrayList<Pair<Integer, Integer>> data;

        Bucket() {
            this.data = new ArrayList<Pair<Integer, Integer>>();
        }

        public void update(Pair<Integer, Integer> pair) {
            boolean found = false;
            for(Pair<Integer, Integer> p: this.data) {
                if(p.key == pair.key) {
                    found = true;
                    p.value = pair.value;
                    return;
                }
            }
            if(!found) {
                this.data.add(pair);
            }
        }

        public int get(int key) {
            for(Pair<Integer, Integer> p: this.data) {
                if(p.key == key) {
                    return p.value;
                }
            }
            return -1;
        }

        public void remove(int key) {
            for(Pair<Integer, Integer> p: this.data) {
                if(p.key == key) {
                    this.data.remove(p);
                    return;
                }
            }
        }



    }


    class MyHashMap {

        Bucket[] data;
        int key_size;

        /** Initialize your data structure here. */
        public MyHashMap() {
            this.key_size = 2069;
            this.data = new Bucket[this.key_size];
            for(int i=0;i<this.key_size;i++) {
                this.data[i] = new Bucket();
            }
        }

        /** value will always be non-negative. */
        public void put(int key, int value) {
            int hash = key % this.key_size;
            Bucket b = this.data[hash];
            b.update(new Pair<Integer, Integer>(key, value));
        }

        /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
        public int get(int key) {
            int hash = key % this.key_size;
            Bucket b = this.data[hash];
            return b.get(key);
        }

        /** Removes the mapping of the specified value key if this map contains a mapping for the key */
        public void remove(int key) {
            int hash = key % this.key_size;
            Bucket b = this.data[hash];
            b.remove(key);
        }
    }


    public void solve() {

    }

    public static void main(String[] args) {
        leetcode_706 t = new leetcode_706();
        t.solve();
    }
}
