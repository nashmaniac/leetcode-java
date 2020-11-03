package leetcode.s901_1000;

import java.util.ArrayList;

public class leetcode_977 {

    class MaxHeap {
        ArrayList<Integer> a;

        public MaxHeap(int[] A) {
            a = new ArrayList<>();
            for(int i=0;i<A.length;i++) {
                a.add(i, A[i]);
            }
        }

        int Parent(int index) {return index/2;}
        int Left(int index) {return 2*index+1;}
        int Right(int index) {return 2*index+2;}

        boolean hasLeft(int index, int size) {return Left(index)<size;}
        boolean hasRight(int index, int size) {return Right(index)<size;}

        void downHeap(int index, int size) {
            while (hasLeft(index, size)) {
                int minIndex = Left(index);
                int minElem = a.get(minIndex);

                if(hasRight(index, size)) {
                    int rightIndex = Right(index);
                    Integer rightElem = a.get(rightIndex);

                    if(rightElem.compareTo(minElem)>0) {
                        minElem = rightElem;
                        minIndex = rightIndex;
                    }
                }

                if(a.get(index).compareTo(minElem)<0) {
                    a.set(minIndex, a.get(index));
                    a.set(index, minElem);
                }
                index = minIndex;
            }
        }

        void upHeap(int index, int size) {
            while (index!=0) {
                int parent = Parent(index);

                if(a.get(parent).compareTo(a.get(index)) < 0) {
                    Integer temp = a.get(index);
                    a.set(index, a.get(parent));
                    a.set(parent, temp);
                }
                index = parent;
            }
        }

        void heapify() {
            int size = a.size();
            for(int i=(size-1)/2;i>=0;i--) {
                this.downHeap(i, size);
            }
        }

        void heapsort() {
            int size = a.size();
            for(int i=size-1;i>=0;i--) {
                Integer temp = a.get(0);
                a.set(0, a.get(size-1));
                a.set(size-1, temp);
                size--;
                this.downHeap(0, size);
            }
        }


    }

    public int[] sortedSquares(int[] A) {
        for(int i=0;i<A.length;i++) {
            if(A[i] >= 0) {
                break;
            }
            A[i] = -A[i];
        }
        MaxHeap h = new MaxHeap(A);
        h.heapify();
        h.heapsort();
        // for(Integer a: h.a) {
        //     System.out.println(a);
        // }
        for(int i=0;i<A.length;i++) {
            A[i] = (int) (Math.pow(h.a.get(i), 2));
        }
        return A;
    }

    public static void main(String[] args) {
        leetcode_977 t = new leetcode_977();
        t.sortedSquares(new int[]{-4,-1,0,3,10});
    }
}
