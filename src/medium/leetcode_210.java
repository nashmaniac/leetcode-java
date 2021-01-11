package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class leetcode_210 {
    public void solve() {
    }


    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] nodes = new int[numCourses];
        HashMap<Integer, ArrayList<Integer>> edges = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int nodeProcessed = 0;


        for (int i = 0; i < prerequisites.length; i++) {
            ArrayList<Integer> a = edges.get(prerequisites[i][1]);

            if (a == null) {
                a = new ArrayList<>();
            }
            a.add(prerequisites[i][0]);
            edges.put(prerequisites[i][1], a);
            nodes[prerequisites[i][0]]++;
        }

        for (int i = 0; i < nodes.length; i++) {
            if (nodes[i] == 0) {
                stack.push(i);
            }
        }

        if (stack.isEmpty()) {
            return new int[numCourses];
        }

        int count = 0;
        int[] courseOrder = new int[numCourses];
        while (!stack.isEmpty()) {
            Integer i = stack.pop();
            nodeProcessed++;
            ArrayList<Integer> b = edges.get(i);
            courseOrder[count++] = i;
            if (b == null || b.isEmpty()) {
                continue;
            }

            for (Integer c : b) {
                nodes[c]--;
                if (nodes[c] == 0) {
                    stack.push(c);
                }
            }
        }

        if (nodeProcessed == numCourses) {
            return courseOrder;
        } else {
            return new int[numCourses];
        }
    }
    public static void main(String[] args) {
        leetcode_210 t = new leetcode_210();
        t.solve();
    }
}
