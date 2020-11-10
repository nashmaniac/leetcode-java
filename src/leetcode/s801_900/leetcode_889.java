package leetcode.s801_900;

public class leetcode_889 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    int[] pre;
    int[] post;

    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        this.pre = pre;
        this.post = post;
        int N = pre.length;
        return make(0, 0, N);
    }

    public TreeNode make(int start, int end, int size) {
        if(size == 0) {
            return null;
        }

        TreeNode root = new TreeNode(this.pre[start]);
        if(size == 1) {
            return root;
        }

        int L = 1;

        for(;L<size;++L) {
            if(post[end+L-1] == pre[start+1]) {
                break;
            }
        }

        root.left = make(start+1, end, L);
        root.right = make(start+1+L, end+L, size-1-L);
        return root;
    }



    public static void main(String[] args) {
        leetcode_889 t = new leetcode_889();
    }
}
