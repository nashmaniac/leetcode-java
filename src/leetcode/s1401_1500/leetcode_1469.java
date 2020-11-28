package leetcode.s1401_1500;

import java.util.ArrayList;
import java.util.List;

public class leetcode_1469 {

    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
    }

    public List<Integer> getLonelyNodes(TreeNode root, List<Integer> arr) {
        if(root == null) {
            return null;
        }
        if(!(root.left != null && root.right != null) || !(root.left == null && root.right==null)) {
            if(root.left != null){
                arr.add(root.left.val);
            } else {
                arr.add(root.right.val);
            }
        }
        getLonelyNodes(root.left, arr);
        getLonelyNodes(root.right, arr);
        return arr;
    }


    public List<Integer> getLonelyNodes(TreeNode root) {
        return getLonelyNodes(root, new ArrayList<>());
    }

    public static void main(String[] args) {
        leetcode_1469 t = new leetcode_1469();
    }
}
