package leetcode.s0601_700;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetcode_692 {
    class Element {
        String word;
        int frequency;

        Element(String w, int f) {
            this.word = w;
            this.frequency = f;
        }
    }

    class MaxHeap {
        ArrayList<Element> data;
        MaxHeap() {
            this.data = new ArrayList<>();
        }


        public int Left(int x) {return 2*x+1;}
        public int Right(int x) {return 2*x+2;}
        public int Parent(int x) {return x/2;}

        public boolean hasLeft(int x) { return Left(x)<this.data.size();}
        public boolean hasRight(int x) { return Right(x)<this.data.size();}

        public void downHeap(int i) {
            while (hasLeft(i)) {
                int left = Left(i);
                Element e = this.data.get(left);
                Element current = this.data.get(i);

                if(hasRight(i)) {
                    int right = Right(i);
                    Element rightElement = this.data.get(right);

                    if(rightElement.frequency > e.frequency) {
                        e = rightElement;
                        left = right;
                    } else if(rightElement.frequency == e.frequency){
                        if(rightElement.word.compareTo(e.word) < 0) {
                            e = rightElement;
                            left = right;
                        }
                    } else {

                    }
                }

                if(e.frequency > current.frequency) {
                    data.set(i, e);
                    data.set(left, current);
                } else if(e.frequency == current.frequency){
                    if(e.word.compareTo(current.word) < 0) {
                        data.set(i, e);
                        data.set(left, current);
                    }
                }
                i = left;

            }
        }


        public void insert(Element c) {
            this.data.add(c);
        }

        public void heapify() {
            for(int i=this.data.size()/2;i>=0;i--) {
                this.downHeap(i);
            }
        }

        public Element remove() {
            Element e = data.get(0);
            data.set(0, data.get(data.size()-1));
            data.remove(data.size()-1);
            downHeap(0);
            return e;
        }
     }


    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> h = new HashMap<>();
        for(int i=0;i<words.length;i++) {
            h.put(words[i], h.getOrDefault(words[i], 0)+1);
        }
        MaxHeap m = new MaxHeap();
        for(Map.Entry<String, Integer> e: h.entrySet()) {
            m.insert(new Element(e.getKey(), e.getValue()));
        }
        m.heapify();

        ArrayList<String> a = new ArrayList<>();

        while (k>0) {
            Element e = m.remove();
            if(e!=null) {
                a.add(e.word);
            }
            k--;
        }

        return a;
    }

    public static void main(String[] args) {
        leetcode_692 t = new leetcode_692();
    }
}
