package leetcode.s0501_600;

import java.util.ArrayList;

public class leetcode_561 {

    class MinHeap {
        ArrayList<Integer> data = new ArrayList<>();
        MinHeap() {
        }
        int Parent(int index) {return index/2;}
        int Left(int index) {return 2*index+1;}
        int Right(int index) {return 2*index+2;}
        boolean hasLeft(int index, int size) {return Left(index)<size;}
        boolean hasRight(int index, int size) {return Right(index)<size;}

        void insert(int i) {
            this.data.add(i);
            this.upHeap(this.data.size()-1);
        }

        void sort() {
//            int size = data.size();
//            for(int i=this.data.size();i>0;i--) {
//                Integer t = data.get(size-1);
//                data.set(size-1, data.get(0));
//                data.set(0, t);
//                size-=1;
//                this.downHeap(0, size);
//            }
        }

        void upHeap(int index) {
            while (index != 0) {
                int p = Parent(index);
                Integer parent = data.get(p);
                if(parent.compareTo(data.get(p)) > 0) {
                    data.set(p, data.get(index));
                    data.set(index, parent);
                }
                index = p;
            }
        }

        void downHeap(int index, int size) {
            while (hasLeft(index, size)) {
                int l = Left(index);
                Integer lElem = data.get(l);
                if(hasRight(index, size)) {
                    int r = Right(index);
                    Integer rElem = data.get(r);

                    if(rElem.compareTo(lElem) < 0) {
                        l = r;
                        lElem = rElem;
                    }
                }

                if(data.get(index).compareTo(lElem) > 0) {
                    data.set(l, data.get(index));
                    data.set(index, lElem);
                }
                index = l;
            }
        }
    }

    public int arrayPairSum(int[] nums) {
        MinHeap h = new MinHeap();
        for(int i=0;i<nums.length;i++) {
            h.insert(nums[i]);
        }
        h.sort();

        for(Integer i: h.data) {
            System.out.println(i+" ");
        }
        System.out.println();

        int total = 0;
        for(int i=0;i<h.data.size()-1;i = i+2) {
            total += Math.min(h.data.get(i), h.data.get(i+1));
        }
        return total;
    }

    public static void main(String[] args) {
        leetcode_561 t = new leetcode_561();
        int[] a = {1,4,3,2};
        System.out.println(t.arrayPairSum(a));
    }
}
