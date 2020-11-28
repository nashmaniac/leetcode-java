package leetcode.s1601_1700;

import java.util.ArrayList;
import java.util.List;

public class leetcode_1656 {

    class OrderedStream {

        List<String> data;
        int size;
        int ptr = 0;

        public OrderedStream(int n) {
            data = new ArrayList<>(n);
            for(int i=0;i<n;i++) {
                data.add(null);
            }
            size = n;
            ptr = 0;
        }

        public List<String> insert(int id, String value) {
            data.add(id-1, value);
            List<String> temp = new ArrayList<>();
            for(int i=ptr;i<size;i++) {
                temp.add(data.get(i));
            }
            if(id-1 == ptr) {
                ptr++;
            }
            return temp;
        }
    }

    public void solve() {
        OrderedStream o = new OrderedStream(5);
        o.insert(3, "ccccccc");
        o.insert(1, "aaaaaaa");
        o.insert(2, "bbbbbbb");
        o.insert(4, "ddddddd");
        o.insert(5, "eeeeeee");
    }

    public static void main(String[] args) {
        leetcode_1656 t = new leetcode_1656();
        t.solve();
    }
}
