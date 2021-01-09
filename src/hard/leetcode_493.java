package hard;

import java.util.HashSet;

public class leetcode_493 {
    public void solve() {

        System.out.println(reversePairs(new int[]{1,3,2,3,1}));
        System.out.println(reversePairs(new int[]{2,4,3,5,1}));
        System.out.println(reversePairs(new int[]{3, 5, 2, 1, 3, 1, 2}));
        System.out.println(reversePairs(new int[]{2147483647,2147483647,2147483647,2147483647,2147483647,2147483647}));
        System.out.println(reversePairs(new int[]{-5, -5}));
        System.out.println(reversePairs(new int[]{233,2000000001,234,2000000006,235,2000000003,236,2000000007,237,2000000002,2000000005,233,233,233,233,233,2000000004}));
//        System.out.println(reversePairs(new int[]{}));
    }


    class TreeNode {
        long val;
        int count;
        TreeNode right;
        TreeNode left;

        TreeNode(long val, int count) {
            this.val = val;
            this.count = count;
            this.right = null;
            this.left = null;
        }
    }


    class BinaryTree {
        TreeNode root;

        BinaryTree() {
            this.root = null;
        }


        public void insert(long val){
            this.root = insert(this.root, val);
        }

        public TreeNode insert(TreeNode root, long val){
            if(root == null) {
                TreeNode n = new TreeNode(val, 1);
                return n;
            }

            if(val < root.val) {
                root.left = insert(root.left, val);
            } else if(val > root.val) {
                root.right = insert(root.right, val);
                root.count++;
            } else {
                root.count++;
            }
            return root;
        }

        public int search(TreeNode root, long val, int ans) {
            if(root == null) {
                return ans;
            }
            if(root.val > val) {
                ans += root.count;
            }

            if(val < root.val) {
                return search(root.left, val, ans);
            } else {
                return search(root.right, val, ans);
            }
        }

        public long search(long val) {
            return search(this.root, val, 0);
        }


    }

    public int reversePairs(int[] nums) {
        int count = 0;
        // check for it all the numbers are same then auto return zero
//        HashSet<Integer> b = new HashSet<>();
        BinaryTree bst = new BinaryTree();
        for(int i=0;i<nums.length;i++) {
            count += bst.search((long) 2*nums[i]);
//            b.add(nums[i]);
            bst.insert((long) nums[i]);
        }
//        if(b.size() == 1 && nums[0] >= 0) {
//            return 0;
//        }
        return count;
    }



    public static void main(String[] args) {
        leetcode_493 t = new leetcode_493();
        t.solve();
    }
}
