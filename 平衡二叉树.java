public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        int leftHeight = treeHeight(root.left) + 1;
        int rightHeight = treeHeight(root.right) + 1;
        
        return Math.abs(leftHeight - rightHeight) > 1 ? false : true;
    }
    
    private int treeHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        if (root.left == null && root.right == null) {
            return 1;
        }
        
        int leftHeight = 1 + treeHeight(root.left);
        int rightHeight = 1 + treeHeight(root.right);
        
        return leftHeight > rightHeight ? leftHeight : rightHeight;
    }
}