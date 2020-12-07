package leetcode.s601_700;

public class leetcode_606 {

    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode(int val) {
            this.val = val;
            this.right = null;
            this.left = null;
        }
    }

    public String tree2str(TreeNode t) {
        if(t == null) {
            return "";
        }

        StringBuilder s = new StringBuilder();
        String left = tree2str(t.left);
        String right = tree2str(t.right);

        s.append(t.val);

        if(!left.isEmpty() && !right.isEmpty()) {
            s.append("("+left+")("+right+")");
        } else if(!left.isEmpty() && right.isEmpty()) {
            s.append("("+left+")");
        } else if(left.isEmpty() && !right.isEmpty()) {
            s.append("()("+right+")");
        } else {

        }
        return s.toString();
    }

    public void solve() {
        Integer[] a = new Integer[]{1, 2, 3, null, 4};
        TreeNode[] nodes = new TreeNode[a.length];
        for(int i=0;i<nodes.length;i++) {
            if(a[i]==null) {
                nodes[i] = null;
            } else {
                nodes[i] = new TreeNode(a[i]);
            }
        }

        for(int i=0;i<nodes.length;i++) {
            if(2*i+1< nodes.length) {
                nodes[i].left = nodes[2*i+1];
            }
            if(2*i+2< nodes.length) {
                nodes[i].right = nodes[2*i+2];
            }
        }

        System.out.println(tree2str(nodes[0]));
    }

    public static void main(String[] args) {
        leetcode_606 t = new leetcode_606();
        t.solve();
    }
}
