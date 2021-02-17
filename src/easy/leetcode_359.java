package easy;

import java.util.HashMap;

public class leetcode_359 {

    class Logger {

        HashMap<String, Integer> h;
        /** Initialize your data structure here. */
        public Logger() {
            h = new HashMap<>();
        }

        /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
         If this method returns false, the message will not be printed.
         The timestamp is in seconds granularity. */
        public boolean shouldPrintMessage(int timestamp, String message) {
            if(!h.containsKey(message)) {
                h.put(message, timestamp + 10);
                return true;
            } else {
                int t = h.get(message);
                h.put(message, timestamp+10);
                if(timestamp>=t) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    public void solve() {
    }

    public static void main(String[] args) {
        leetcode_359 t = new leetcode_359();
        t.solve();
    }
}
