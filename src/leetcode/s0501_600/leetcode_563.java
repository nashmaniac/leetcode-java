package leetcode.s0501_600;

public class leetcode_563 {


    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
        public TreeNode(int val) {
            this.val = val;
            this.right = null;
            this.left = null;
        }
    }

    class TiltNode  {
        int sum;
        int tilt;
        int tiltsum;
        public TiltNode(int sum, int tilt, int tiltsum) {
            this.sum = sum;
            this.tiltsum = tiltsum;
            this.tilt = tilt;
        }
    }

    public TiltNode setTilt(TreeNode root, int sum, int tilt, int tiltsum) {
        if(root == null) {
            return new TiltNode(0, 0, 0);
        }
        TiltNode left = setTilt(root.left, sum, tilt, tiltsum);
        TiltNode right = setTilt(root.right, sum, tilt, tiltsum);
        tilt = tilt + Math.abs(left.sum-right.sum);
        sum = root.val + left.sum + right.sum;
        tiltsum = tilt+ left.tiltsum+ right.tiltsum;
        return new TiltNode(sum, tilt, tiltsum);
    }

    public int findTilt(TreeNode root) {
        return setTilt(root, 0, 0, 0).tiltsum;
    }

    public void buildTree() {
        String[] n = new String[]{"4","2","9" ,"3", "5", "null", "7" };
        TreeNode[] nodes = new TreeNode[n.length];
        for(int i=0;i<n.length;i++) {
            if(n[i].equals("null")) {
                nodes[i] = null;
            } else {
                nodes[i] = new TreeNode(Integer.valueOf(n[i]));
            }

        }
        for(int i=0;i<nodes.length;i++) {
            if(nodes[i] != null) {
                if(2*i+1<nodes.length) {
                    nodes[i].left = nodes[2*i+1];
                }
                if(2*i+2<nodes.length) {
                    nodes[i].right = nodes[2*i+2];
                }
            }
        }

        System.out.println(findTilt(nodes[0]));

    }

    public static void main(String[] args) {
        leetcode_563 t = new leetcode_563();
        t.buildTree();
    }
}
