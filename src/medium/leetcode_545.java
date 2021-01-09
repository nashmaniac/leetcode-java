package medium;

import java.util.*;

public class leetcode_545 {
    public void solve() {
    }

    class  TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
    }

    public int findHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }

        return 1+ Math.max(findHeight(root.left), findHeight(root.right));
    }


    class Elem {
        TreeNode node;
        int level;
        Elem(TreeNode node, int level) {

        }
    }

    public void BFS(TreeNode root, ArrayList<Integer>[] arr, ArrayList<Integer> a) {
        if(root == null) {
            return;
        }
        Queue<Elem> q = new LinkedList<>();
        q.offer(new Elem(root, 0));
        while (q.isEmpty()) {
            Elem node = q.poll();
            arr[node.level].add(node.node.val);

            if(node.node.left != null) {
                q.offer(new Elem(node.node.left, node.level+1));
            }
            if(node.node.right != null) {
                q.offer(new Elem(node.node.right, node.level+1));
            }

            if(node.node.left == null && node.node.right == null) {
                a.add(node.node.val);
            }
        }

    }
    

    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        int h = findHeight(root);

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer>[] arr = new ArrayList[h];


        for(int i=0;i<h;i++) {
            arr[i] = new ArrayList<>();
        }

        BFS(root, arr, a);

        for(int i=0;i<arr.length;i++) {
            if(!arr[i].isEmpty()) {
                a.add(arr[i].get(0));
                a.add(arr[i].get(arr[i].size()-1));
            }
        }

        Collections.sort(a);
        if(!a.isEmpty()){
            int count = 0;
            for(int i=1;i<a.size();i++) {
                if(a.get(i) != a.get(i-1)) {
                    count++;
                    a.set(count, a.get(i));
                }
            }
            for(int i=a.size()-1;i>count;i++) {
                a.remove(a.size()-1);
            }
        }
        return a;
    }

    public static void main(String[] args) {
        leetcode_545 t = new leetcode_545();
        t.solve();
    }
}
