/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        if (root.left == null && root.right == null) {
            return 1;
        }
        
        int leftDepth = 1 + TreeDepth(root.left);
        int rightDepth = 1 + TreeDepth(root.right);
        
        return leftDepth > rightDepth ? leftDepth : rightDepth;
    }
}