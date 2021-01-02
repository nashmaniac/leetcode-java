package medium;

import java.util.*;

public class leetcode_347 {
    public void solve() {

//        int[] a = topKFrequent(new int[]{1,1,1,2,2,3}, 1);
        int[] a = topKFrequent(new int[]{-1, -1}, 1);
        for(int i: a) {
            System.out.println(i);
        }
    }

    class Element {
        int val;
        int key;
        Element(int k, int v) {
            this.key = k;
            this.val = v;
        }
    }

    class CustomQueue {
        ArrayList<Element> data;

        CustomQueue() {
            this.data = new ArrayList<>();
        }

        public void upHeap() {
            int i = this.data.size() - 1;
            while (i>0) {
                int p = Parent(i);
                Element parent = this.data.get(p);
                Element current = this.data.get(i);

                if(parent.key < current.key) {
                    this.data.set(p, current);
                    this.data.set(i, parent);
                }

                i = p;
            }
        }

        public void downHeap(int i) {
            while (hasLeft(i)) {
                int l = Left(i);
                Element maxElement = this.data.get(l);

                if(hasRight(i)) {
                    int r = Right(i);
                    Element rightElement = this.data.get(r);
                    if(rightElement.key > maxElement.key) {
                        maxElement = rightElement;
                        l = r;
                    }
                }

                Element current = this.data.get(i);
                if(current.key < maxElement.key) {
                    this.data.set(l, current);
                    this.data.set(i, maxElement);
                }
                i = l;
            }
        }

        public int pop() {
            Element current = this.data.get(0);
            this.data.set(0, this.data.get(this.data.size()-1));
            this.data.remove(this.data.size()-1);
            this.downHeap(0);
            return current.val;
        }

        public int Parent(int i) {return i/2;}
        public int Left(int i) {return 2*i+1;}
        public int Right(int i) {return 2*i+2;}
        public boolean hasLeft(int i) { return Left(i)<this.data.size();}
        public boolean hasRight(int i) { return Right(i)<this.data.size();}

        public void insert(Element e) {
            this.data.add(e);
            this.upHeap();
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i: nums) {
            h.put(i, h.getOrDefault(i, 0)+1);
        }

        CustomQueue q = new CustomQueue();
        for(Map.Entry<Integer, Integer> m: h.entrySet()) {
            q.insert(new Element(m.getKey(), m.getValue()));
        }
        int[] a = new int[k];
        for(int i=0;i<a.length;i++) {
            a[i] = q.pop();
        }
        return a;
    }

    public static void main(String[] args) {
        leetcode_347 t = new leetcode_347();
        t.solve();
    }
}
